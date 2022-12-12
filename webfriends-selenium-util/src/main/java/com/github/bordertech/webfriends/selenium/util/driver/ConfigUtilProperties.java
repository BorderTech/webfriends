package com.github.bordertech.webfriends.selenium.util.driver;

import com.github.bordertech.config.Config;
import com.github.bordertech.didums.Factory;
import com.github.bordertech.webfriends.selenium.util.driver.type.WebDriverType;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.text.MessageFormat;
import java.util.Properties;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.lang.ArrayUtils;

/**
 * This class contains references to all constants and configuration options.
 */
public final class ConfigUtilProperties {

	/**
	 * The driver type prefix.
	 */
	private static final String DRIVER_PREFIX = "bordertech.webfriends.selenium.driver.";

	/**
	 * The capabilities of each web driver.
	 */
	private static final String SELENIUM_DRIVER_CAPABILITIES = DRIVER_PREFIX + "{0}.capabilities";

	/**
	 * The list of driver type short names to use for the MultiBrowserRunner.
	 */
	private static final String SELENIUM_MULTI_BROWSER_DRIVERS = DRIVER_PREFIX + "runner";

	/**
	 * The flag indicating whether to run the MultiBrowserRunner in parallel.
	 */
	private static final String SELENIUM_MULTI_BROWSER_PARALLEL = "bordertech.webfriends.selenium.runParallel";

	/**
	 * The flag indicating whether the selenium tests are running in parallel methods.
	 */
	private static final String SELENIUM_PARALLEL_METHODS = "bordertech.webfriends.selenium.parallel.methods";

	/**
	 * The height in pixels of the Selenium screen.
	 */
	private static final String SELENIUM_SCREEN_HEIGHT = "bordertech.webfriends.selenium.screenHeight";

	/**
	 * The width in pixels of the Selenium screen.
	 */
	private static final String SELENIUM_SCREEN_WIDTH = "bordertech.webfriends.selenium.screenWidth";

	/**
	 * The flag indicating whether to start the server when the test case launches.
	 */
	private static final String SELENIUM_SERVER_START = "bordertech.webfriends.selenium.launchServer";

	/**
	 * The URL of the server to connect to for the Selenium test case.
	 */
	private static final String SELENIUM_SERVER_URL = "bordertech.webfriends.selenium.serverUrl";
	/**
	 * The attribute to check for whether the page is ready.
	 */
	private static final String SELENIUM_DATA_READY_TAG = "bordertech.webfriends.selenium.pageReadyAttribute";

	/**
	 * How many seconds to wait for an element if it is not found.
	 */
	private static final String SELENIUM_IMPLICIT_WAIT = "bordertech.webfriends.selenium.implicitWait";

	/**
	 * The duration in seconds to wait for the page to be ready.
	 */
	private static final String SELENIUM_PAGE_READY_TIMEOUT = "bordertech.webfriends.selenium.pageReadyTimeout";

	/**
	 * The duration in milliseconds between poll attempts for page ready.
	 */
	private static final String SELENIUM_PAGE_READY_POLL_INTERVAL = "bordertech.webfriends.selenium.pageReadyPollInterval";

	/**
	 * The duration in seconds to wait to verify the correct page is loaded.
	 */
	private static final String SELENIUM_VERIFY_PAGE_TIMEOUT = "bordertech.webfriends.selenium.verifyPageTimeout";

	/**
	 * The duration in milliseconds between poll attempts to verify correct page is loaded.
	 */
	private static final String SELENIUM_VERIFY_PAGE_POLL_INTERVAL = "bordertech.webfriends.selenium.verifyPagePollInterval";

	/**
	 * The flag indicating whether {@link WebDriverManager} should be used before creating driver instances.
	 */
	private static final String WEBDRIVER_MANAGER_ENABLED = "bordertech.webfriends.webdrivermanager.enabled";

	/**
	 * Private constructor for static class.
	 */
	private ConfigUtilProperties() {
		//No-impl
	}

	/**
	 * The WebDriver capabilities for the given driver type.
	 *
	 * @param driverType the driver type.
	 * @return the parameter value if set, or empty properties if not set.
	 */
	public static Properties getDriverCapabilities(final String driverType) {
		String paramName = MessageFormat.format(SELENIUM_DRIVER_CAPABILITIES, driverType);
		return get().getProperties(paramName);
	}

	/**
	 * @param driver the driver short name
	 * @return the driver implementation parameter key.
	 */
	public static WebDriverType createDriverTypeInstance(final String driver) {
		String key = WebDriverType.class.getName() + "." + driver;
		return Factory.newInstance(key);
	}

	/**
	 * The list of driver short names to use in the MultiBrowserRunner.
	 *
	 * @return the parameter value, or null if not set.
	 */
	public static String[] getMultiBrowserDrivers() {
		String[] drivers = get().getStringArray(SELENIUM_MULTI_BROWSER_DRIVERS);
		if (ArrayUtils.isEmpty(drivers)) {
			throw new IllegalStateException("Cannot run the MultiBrowserRunner without drivers defined in default param ["
					+ ConfigUtilProperties.SELENIUM_MULTI_BROWSER_DRIVERS + "].");
		}
		return drivers;
	}

	/**
	 * The flag indicating whether the MultiBrowserRunner should run in parallel.
	 *
	 * @return the parameter value, or false if not set.
	 */
	public static boolean isMultiBrowserDriverParallel() {
		return get().getBoolean(SELENIUM_MULTI_BROWSER_PARALLEL, false);
	}

	/**
	 * The flag indicating whether the Selenium Tests are running in parallel methods.
	 *
	 * @return the parameter value, or false if not set.
	 */
	public static boolean isParallelMethods() {
		return get().getBoolean(SELENIUM_PARALLEL_METHODS, false);
	}

	/**
	 * The height in pixels of the selenium screen.
	 *
	 * @return the parameter value, or 1080 if not set.
	 */
	public static int getScreenHeight() {
		return get().getInt(SELENIUM_SCREEN_HEIGHT, 1080);
	}

	/**
	 * The width in pixels of the selenium screen.
	 *
	 * @return the parameter value, or 1920 if not set.
	 */
	public static int getScreenWidth() {
		return get().getInt(SELENIUM_SCREEN_WIDTH, 1920);
	}

	/**
	 * The flag indicating whether to start the server when the test case launches.
	 *
	 * @return the parameter value, or false if not set.
	 */
	public static boolean isServerStart() {
		return get().getBoolean(SELENIUM_SERVER_START, true);
	}

	/**
	 * The URL to run a Selenium test against.
	 *
	 * @return the parameter value, or null if not set.
	 */
	public static String getServerUrl() {
		return get().getString(SELENIUM_SERVER_URL);
	}

	/**
	 * The HTML body attribute indicating the page is ready.
	 *
	 * @return the parameter value, or "data-sel-domready" if not set.
	 */
	public static String getDataReadyTag() {
		return get().getString(SELENIUM_DATA_READY_TAG, "data-sel-domready");
	}

	/**
	 * The duration in seconds to wait for an element if it is not found.
	 *
	 * @return the parameter value if set, or 5 seconds if not set.
	 */
	public static long getImplicitWait() {
		return get().getLong(SELENIUM_IMPLICIT_WAIT, 5);
	}

	/**
	 * The interval in milliseconds between page ready poll attempts.
	 *
	 * @return the parameter value, or 75 if not set.
	 */
	public static long getPageReadyPollInterval() {
		return get().getLong(SELENIUM_PAGE_READY_POLL_INTERVAL, 75);
	}

	/**
	 * The duration in seconds to wait for the page to be ready.
	 *
	 * @return the parameter value if set, or 10 if not set.
	 */
	public static int getPageReadyTimeout() {
		return get().getInt(SELENIUM_PAGE_READY_TIMEOUT, 10);
	}

	/**
	 * The interval in milliseconds to verify the correct page is loaded.
	 *
	 * @return the parameter value, or 50 if not set.
	 */
	public static long getVerifyPagePollInterval() {
		return get().getLong(SELENIUM_VERIFY_PAGE_POLL_INTERVAL, 50);
	}

	/**
	 * The duration in seconds to wait to verify the correct page is loaded.
	 *
	 * @return the parameter value if set, or 2 if not set.
	 */
	public static int getVerifyPageTimeout() {
		return get().getInt(SELENIUM_VERIFY_PAGE_TIMEOUT, 2);
	}

	/**
	 * The flag indicating whether {@link WebDriverManager} should be used before creating driver instances.
	 *
	 * @return the parameter value, or true if not set.
	 */
	public static boolean isWebDriverManagerEnabled() {
		return get().getBoolean(WEBDRIVER_MANAGER_ENABLED, true);
	}

	/**
	 * Shorthand convenience method to get the Configuration instance.
	 *
	 * @return the Configuration instance.
	 */
	private static Configuration get() {
		return Config.getInstance();
	}
}
