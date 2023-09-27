package com.github.bordertech.webfriends.selenium.util.driver;

import com.github.bordertech.didums.Didums;
import com.github.bordertech.webfriends.selenium.util.driver.type.WebDriverType;
import org.openqa.selenium.WebDriver;

/**
 * Driver factory that creates a FriendDriver backed by the Selenium WebDriver.
 */
public class DriverFactory {

	/**
	 * Create a FriendDriver backed by the driver implementation of the given WebDriverType.
	 *
	 * @param driverType the WebDriverType that references the backing WebDriver to wrap
	 * @return a FriendDriver wrapping the given backing driver
	 */
	public static FriendDriver createDriverInstance(final WebDriverType driverType) {
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
	public static FriendDriver createDriverInstance(final WebDriver webDriver) {
		if (webDriver == null) {
			throw new IllegalArgumentException("Backing driver must be provided.");
		}
		FriendDriver friend = createDefaultDriver();
		friend.setWebDriver(webDriver);
		friend.configDriver();
		return friend;
	}

	/**
	 * @return the default driver instance
	 */
	public static FriendDriver createDefaultDriver() {
		return Didums.getService(FriendDriver.class, FriendDriver.class);
	}

}
