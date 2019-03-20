package com.github.bordertech.webfriends.selenium.util.server;

import com.github.bordertech.didums.Didums;

/**
 * Local server launcher (e.g. Tomcat).
 */
public final class Launcher {

	private static final ServerProvider PROVIDER = Didums.getService(ServerProvider.class, ServerProviderDefault.class);

	/**
	 * Private constructor.
	 */
	private Launcher() {
	}

	/**
	 * @return the web friends provider
	 */
	public static ServerProvider getProvider() {
		return PROVIDER;
	}

}
