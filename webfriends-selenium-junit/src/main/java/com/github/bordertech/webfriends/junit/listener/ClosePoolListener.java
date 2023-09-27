package com.github.bordertech.webfriends.junit.listener;

import com.github.bordertech.webfriends.selenium.util.driver.DriverCache;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

/**
 * Listener to close all Drivers in the POOL.
 */
public class ClosePoolListener extends RunListener {

	@Override
	public void testRunFinished(final Result result) throws Exception {
		DriverCache.releaseAll();
	}

}
