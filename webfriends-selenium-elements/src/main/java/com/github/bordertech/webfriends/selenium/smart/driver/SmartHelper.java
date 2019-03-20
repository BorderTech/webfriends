package com.github.bordertech.webfriends.selenium.smart.driver;

import com.github.bordertech.webfriends.selenium.util.driver.Helper;

/**
 * Recasts the Util helper to the Smart Elements Helper.
 */
public final class SmartHelper {

	/**
	 * @return the smart elements helper
	 */
	public static SmartHelperProvider getProvider() {
		return (SmartHelperProvider) Helper.getProvider();
	}

}
