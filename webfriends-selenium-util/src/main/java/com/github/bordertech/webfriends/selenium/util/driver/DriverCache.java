package com.github.bordertech.webfriends.selenium.util.driver;

import com.github.bordertech.webfriends.selenium.util.driver.type.WebDriverType;
import java.util.HashMap;
import java.util.Map;

/**
 * POOL of Drivers that can be reused by tests.
 * <p>
 * Tests run in parallel use a unique driver.
 * </p>
 */
public final class DriverCache {

	private static final Map<String, FriendDriver> POOL = new HashMap<>();

	/**
	 * Get a driver from the POOL.
	 *
	 * @param driverType the driver type
	 * @return the driver from the POOL
	 */
	public static FriendDriver getDriver(final WebDriverType driverType) {
		// Get Driver from pool
		String key = driverType.getDriverTypeName();
		FriendDriver driver = POOL.get(key);
		if (driver == null) {
			driver = createDriver(driverType);
			POOL.put(key, driver);
		}
		return driver;
	}

	/**
	 * @param type the driver type to create
	 * @return the driver instance
	 */
	public static FriendDriver createDriver(final WebDriverType type) {
		return Helper.getProvider().createDriverInstance(type);
	}

	/**
	 * Release all drivers from the POOL.
	 */
	public static void releaseAll() {
		POOL.values().forEach(poolDriver -> {
			poolDriver.quit();
		});
		POOL.clear();
	}

	/**
	 * Private constructor.
	 */
	private DriverCache() {
		// No impl
	}

}
