package com.github.bordertech.webfriends.selenium.smart.driver;

import com.github.bordertech.webfriends.selenium.util.driver.Helper;

/**
 * Recasts the helper to the Smart Helper.
 */
public final class SmartHelper {

	/**
	 * @return the smart elements helper
	 */
	public static SmartHelperProvider getProvider() {
		return (SmartHelperProvider) Helper.getProvider();
	}

	/**
	 * Private constructor.
	 */
	private SmartHelper() {
		// No IMPL
	}

}
