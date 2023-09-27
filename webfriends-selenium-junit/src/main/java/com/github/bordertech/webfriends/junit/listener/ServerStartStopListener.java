package com.github.bordertech.webfriends.junit.listener;

import com.github.bordertech.webfriends.junit.server.Launcher;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

/**
 * Listener to start and stop the web server before the unit tests.
 */
public class ServerStartStopListener extends RunListener {

	@Override
	public void testRunStarted(final Description description) throws Exception {
		Launcher.getProvider().startSuite();
	}

	@Override
	public void testRunFinished(final Result result) throws Exception {
		Launcher.getProvider().stopSuite();
	}

}
