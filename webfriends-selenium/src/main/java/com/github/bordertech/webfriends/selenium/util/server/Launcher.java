package com.github.bordertech.webfriends.selenium.util.server;

import com.github.bordertech.didums.Factory;

/**
 * Local server launcher (e.g. Tomcat).
 */
public final class Launcher {

	private static final ServerProvider PROVIDER = Factory.newInstance(ServerProvider.class, ServerProviderDefault.class);

	/**
	 * @return the web friends provider
	 */
	public static ServerProvider getProvider() {
		return PROVIDER;
	}

}
