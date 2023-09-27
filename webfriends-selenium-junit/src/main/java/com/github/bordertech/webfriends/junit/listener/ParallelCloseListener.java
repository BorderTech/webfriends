package com.github.bordertech.webfriends.junit.listener;

import com.github.bordertech.webfriends.selenium.util.driver.FriendDriver;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

/**
 * Listener to quit driver for parallel tests.
 */
public class ParallelCloseListener extends RunListener {

	private final FriendDriver driver;

	public ParallelCloseListener(final FriendDriver driver) {
		this.driver = driver;
	}

	@Override
	public void testRunFinished(final Result result) throws Exception {
		driver.quit();
	}

}
