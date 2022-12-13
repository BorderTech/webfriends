package com.github.bordertech.webfriends.selenium.util.driver;

import com.github.bordertech.didums.Didums;
import com.github.bordertech.webfriends.selenium.util.driver.type.WebDriverType;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/**
 * Driver helper provider.
 */
public class HelperProvider {

	/**
	 * Create a FriendDriver backed by the driver implementation of the given WebDriverType.
	 *
	 * @param driverType the WebDriverType that references the backing WebDriver to wrap
	 * @return a FriendDriver wrapping the given backing driver
	 */
	public FriendDriver createDriverInstance(final WebDriverType driverType) {
		if (driverType == null) {
			throw new IllegalArgumentException("Driver type must be provided.");
		}
		WebDriver driver = driverType.getDriverInstance();
		return createDriverInstance(driver);
	}

	/**
	 * Create a FriendDriver backed by the given WebDriver.
	 *
	 * @param webDriver the WebDriver implementation
	 * @return a FriendDriver wrapping the given backing driver
	 */
	public FriendDriver createDriverInstance(final WebDriver webDriver) {
		if (webDriver == null) {
			throw new IllegalArgumentException("Backing driver must be provided.");
		}
		FriendDriver friend = createDefaultDriver();
		friend.setWebDriver(webDriver);
		configDriver(webDriver);
		return friend;
	}

	/**
	 * @return the default driver instance
	 */
	protected FriendDriver createDefaultDriver() {
		return new FriendDriver();
	}

	/**
	 * Configure the web driver with the standard configuration.
	 *
	 * @param driver the web driver to configure
	 */
	public void configDriver(final WebDriver driver) {
		if (driver == null) {
			throw new IllegalArgumentException("A web driver must be provided.");
		}
		configWait(driver);
		int width = ConfigUtilProperties.getScreenWidth();
		int height = ConfigUtilProperties.getScreenHeight();
		driver.manage().window().setSize(new Dimension(width, height));
	}

	/**
	 * Configure the default web driver implicit wait.
	 *
	 * @param driver the web driver to configure.
	 */
	public void configWait(final WebDriver driver) {
		long seconds = ConfigUtilProperties.getImplicitWait();
		setImplicitWait(driver, seconds, TimeUnit.SECONDS);
	}

	/**
	 * Configure the web driver implicit wait for immediate find (ie no wait).
	 *
	 * @param driver the WebDriver to configure.
	 */
	public void configNoWait(final WebDriver driver) {
		setImplicitWait(driver, 0, TimeUnit.MILLISECONDS);
	}

	/**
	 * Configure the web driver implicit wait.
	 *
	 * @param driver the WebDriver to configure.
	 * @param time the amount of time to wait.
	 * @param unit the unit of measure for {@code time}.
	 */
	public void setImplicitWait(final WebDriver driver, final long time, final TimeUnit unit) {
		if (driver == null) {
			throw new IllegalArgumentException("A web driver must be provided.");
		}
		driver.manage().timeouts().implicitlyWait(time, unit);
	}

	/**
	 * Wait for the AJAX to complete.
	 *
	 * @param driver the web driver
	 */
	public void waitForAjaxReady(final WebDriver driver) {
		waitForPageReady(driver);
	}

	/**
	 * Wait for the page to have loaded, including all AJAX and JavaScript. Uses default values for timeout and polling interval.
	 *
	 * @param driver the web driver
	 */
	public void waitForPageReady(final WebDriver driver) {
		Function<WebDriver, Boolean> condition = getPageReadyCondition();
		if (condition != null) {
			int timeout = ConfigUtilProperties.getPageReadyTimeout();
			long polling = ConfigUtilProperties.getPageReadyPollInterval();
			waitForCondition(driver, timeout, polling, condition);
		}
	}

	/**
	 * Verify the correct page has been loaded.
	 *
	 * @param driver the web driver
	 * @param condition the page verify condition
	 */
	public void verifyPageCondition(final WebDriver driver, final Function<WebDriver, Boolean> condition) {
		// Check page is ready before verifying page
		waitForPageReady(driver);
		if (condition != null) {
			int timeout = ConfigUtilProperties.getVerifyPageTimeout();
			long polling = ConfigUtilProperties.getVerifyPagePollInterval();
			waitForCondition(driver, timeout, polling, condition);
		}
	}

	/**
	 * Wait for the condition to be true.
	 *
	 * @param driver the the web driver
	 * @param timeoutSeconds - the number of seconds after which the 'wait' will time out
	 * @param pollingMilliseconds - the number of milliseconds to wait between each poll attempt
	 * @param condition the expected condition
	 */
	public void waitForCondition(final WebDriver driver, final int timeoutSeconds, final long pollingMilliseconds, final Function<WebDriver, Boolean> condition) {
		if (driver == null) {
			throw new IllegalArgumentException("A web driver must be provided.");
		}
		if (condition == null) {
			throw new IllegalArgumentException("A condition must be provided.");
		}
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds), Duration.ofMillis(pollingMilliseconds));
		wait.until(condition);
	}

	/**
	 * Get the page ready condition.
	 *
	 * @return the condition for page ready, or null for no condition
	 */
	public PageReadyCondition getPageReadyCondition() {
		if (Didums.hasService(PageReadyCondition.class)) {
			return Didums.getService(PageReadyCondition.class);
		}
		return null;
	}

	/**
	 * Set focus to this element.
	 *
	 * @param driver the driver
	 * @param webElement the web element to focus
	 */
	public void setFocus(final FriendDriver driver, final WebElement webElement) {
		// Get element ID
		String id = webElement.getAttribute("id");
		if (StringUtils.isEmpty(id)) {
			return;
		}
		// Build script
		StringBuilder script = new StringBuilder("window.focus(); document.getElementById('");
		script.append(id);
		script.append("').focus();");
		// Execute script
		driver.executeJavascript(script.toString());
	}
}
