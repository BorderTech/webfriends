package com.github.bordertech.webfriends.selenium.util.helper;

import com.github.bordertech.didums.Factory;

/**
 * Web friends selenium helper.
 */
public final class Helper {

	private static final HelperProvider PROVIDER = Factory.newInstance(HelperProvider.class, HelperProvider.class);

	/**
	 * @return the web friends provider
	 */
	public static HelperProvider getProvider() {
		return PROVIDER;
	}

}
