package com.github.bordertech.webfriends.junit.server;

import com.github.bordertech.lde.api.LdeLauncher;

/**
 * Default launcher.
 */
public class ServerProviderDefault implements ServerProvider {

	private boolean inSuite = false;

	@Override
	public void startSuite() {
		startServer();
		inSuite = true;
	}

	@Override
	public void stopSuite() {
		inSuite = false;
		stopServer();
	}

	@Override
	public void startServer() {
		if (!isRunning()) {
			LdeLauncher.launchServer(false);
		}
	}

	@Override
	public void stopServer() {
		if (!inSuite()) {
			LdeLauncher.stopServer();
		}
	}

	@Override
	public void restartServer() {
		if (isRunning()) {
			stopServer();
		}
		startServer();
	}

	@Override
	public boolean isRunning() {
		return LdeLauncher.isRunning();
	}

	@Override
	public boolean inSuite() {
		return inSuite;
	}

	@Override
	public String getBaseUrl() {
		return LdeLauncher.getProvider().getBaseUrl();
	}

}
