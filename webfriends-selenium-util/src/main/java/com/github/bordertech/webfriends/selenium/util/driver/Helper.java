package com.github.bordertech.webfriends.selenium.util.driver;

import com.github.bordertech.didums.Didums;

/**
 * Driver helper.
 */
public final class Helper {

	private static final HelperProvider PROVIDER = Didums.getService(HelperProvider.class, HelperProvider.class);

	/**
	 * Prevent instantiation.
	 */
	private Helper() {
		// Private
	}

	/**
	 * @return the driver helper provider
	 */
	public static HelperProvider getProvider() {
		return PROVIDER;
	}

}
