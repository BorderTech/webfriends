package com.github.bordertech.webfriends.selenium.by.provider;

import com.github.bordertech.didums.Factory;

/**
 * Web friends BY helper.
 */
public final class HelperBy {

	private static final HelperByProvider PROVIDER = Factory.newInstance(HelperByProvider.class, HelperByProvider.class);

	/**
	 * @return the by label provider
	 */
	public static HelperByProvider getProvider() {
		return PROVIDER;
	}

}
