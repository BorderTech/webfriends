package com.github.bordertech.webfriends.selenium.junit.runner.listener;

import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

/**
 * Listener to close all Drivers in the POOL.
 */
public class DriverSuiteClosePoolListener extends RunListener {

	@Override
	public void testRunFinished(final Result result) throws Exception {
		DriverCache.releaseAll();
	}

}
