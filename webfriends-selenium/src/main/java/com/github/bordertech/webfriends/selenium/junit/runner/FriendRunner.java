package com.github.bordertech.webfriends.selenium.junit.runner;

import com.github.bordertech.webfriends.selenium.junit.runner.listener.DriverCache;
import com.github.bordertech.webfriends.selenium.junit.runner.listener.DriverSuiteClosePoolListener;
import com.github.bordertech.webfriends.selenium.junit.runner.listener.DriverTestParallelCloseListener;
import com.github.bordertech.webfriends.selenium.junit.runner.listener.ServerStartStopListener;
import com.github.bordertech.webfriends.selenium.junit.testcase.FriendTestCase;
import com.github.bordertech.webfriends.selenium.util.config.ConfigurationProperties;
import com.github.bordertech.webfriends.selenium.util.driver.FriendDriver;
import com.github.bordertech.webfriends.selenium.util.driver.type.WebDriverType;
import com.github.bordertech.webfriends.selenium.util.server.Launcher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.Suite;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerScheduler;
import org.junit.runners.model.Statement;

/**
 * FriendRunner will start/stop a server and run unit tests using 1 or more browsers.
 */
public class FriendRunner extends Suite {

	private final List<Runner> runners = new ArrayList<>();
	private final boolean runParallel;
	private final boolean launchServer;

	/**
	 * Only called reflectively. Do not use programmatically.
	 *
	 * @param clazz the test case to run.
	 * @throws InitializationError if there is an error.
	 */
	public FriendRunner(final Class<?> clazz) throws InitializationError {
		super(clazz, Collections.<Runner>emptyList());

		String[] drivers = ConfigurationProperties.getMultiBrowserDrivers();
		this.runParallel = drivers.length > 1 && ConfigurationProperties.isMultiBrowserDriverParallel();
		// Create runner for each browser
		for (String driver : drivers) {
			WebDriverType driverType = ConfigurationProperties.createDriverTypeInstance(driver);
			runners.add(new TestClassRunnerForBrowser(getTestClass().getJavaClass(), driverType, runParallel));
		}
		if (runParallel) {
			setScheduler(new ThreadPoolScheduler());
		}
		this.launchServer = ConfigurationProperties.isServerStart();
	}

	@Override
	public void run(final RunNotifier notifier) {
		if (launchServer) {
			// Start and stop the server
			notifier.addListener(new ServerStartStopListener());
			notifier.fireTestRunStarted(Description.EMPTY);
		}
		if (!runParallel) {
			notifier.addListener(new DriverSuiteClosePoolListener());
		}
		super.run(notifier);
	}

	@Override
	protected List<Runner> getChildren() {
		return runners;
	}

	/**
	 * This class will run all the tests for a given test class using a single browser.
	 */
	private static final class TestClassRunnerForBrowser extends BlockJUnit4ClassRunner {

		private final WebDriverType driverType;
		private final FriendDriver driver;
		private final boolean runParallel;
		private final boolean launchServer;

		/**
		 * Creates a TestClassRunnerForBrowser.
		 *
		 * @param testClass the test class to run
		 * @param driverType the driver
		 * @param runParallel true if running in parallel
		 * @throws InitializationError if there is an error creating the runner.
		 */
		private TestClassRunnerForBrowser(final Class<?> testClass, final WebDriverType driverType, final boolean runParallel) throws
				InitializationError {
			super(testClass);
			this.driverType = driverType;
			if (runParallel) {
				// Unique driver for test class
				driver = DriverCache.createDriver(driverType);
			} else {
				// Driver from POOL
				driver = DriverCache.getDriver(driverType);
			}
			this.runParallel = runParallel;
			this.launchServer = ConfigurationProperties.isServerStart();
		}

		@Override
		public Object createTest() throws Exception {
			Object test = super.createTest();
			if (!(test instanceof FriendTestCase)) {
				throw new IllegalStateException("MultiBrowserRunner cannot be used for test that does not implement FriendTestCase."
						+ " test class: " + test.getClass().getName());
			}
			String baseUrl = launchServer ? Launcher.getProvider().getBaseUrl() : ConfigurationProperties.getServerUrl();
			((FriendTestCase) test).initFriendTestCase(driver, baseUrl);
			return test;
		}

		@Override
		public void run(final RunNotifier notifier) {
			if (runParallel) {
				notifier.addListener(new DriverTestParallelCloseListener(driver));
			}
			super.run(notifier);
		}

		@Override
		protected String getName() {
			return super.getName() + getTestDetails();
		}

		@Override
		protected String testName(final FrameworkMethod method) {
			return String.format("%s[%s]", method.getName(), getTestDetails());
		}

		@Override
		protected void validateConstructor(final List<Throwable> errors) {
			validateOnlyOneConstructor(errors);
		}

		@Override
		protected Statement classBlock(final RunNotifier notifier) {
			return childrenInvoker(notifier);
		}

		/**
		 * @return the details of the test as a String to suffix on the name.
		 */
		private String getTestDetails() {
			return "." + driverType.getDriverTypeName();
		}
	}

	/**
	 * This jUnit runner scheduler extension allows multiple threads.
	 */
	private static final class ThreadPoolScheduler implements RunnerScheduler {

		/**
		 * The executor which will run the tests.
		 */
		private final ExecutorService executor;

		/**
		 * Creates a ThreadPoolScheduler.
		 */
		private ThreadPoolScheduler() {
			executor = Executors.newCachedThreadPool();
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public void finished() {
			executor.shutdown();

			try {
				executor.awaitTermination(10 * 60, TimeUnit.SECONDS); // 10 mins, overly generous
			} catch (InterruptedException exc) {
				throw new IllegalStateException("Test execution timed out", exc);
			}
		}

		@Override
		public void schedule(final Runnable childStatement) {
			executor.submit(childStatement);
		}
	}

}
