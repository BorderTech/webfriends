package com.github.bordertech.webfriends.junit.runner;

import com.github.bordertech.webfriends.selenium.util.driver.FriendDriver;
import com.github.bordertech.webfriends.selenium.util.driver.FriendTestCase;
import org.junit.runner.RunWith;

/**
 * Test class that uses the {@link FriendSuite} runner.
 *
 * @param <T> the driver type
 */
@RunWith(FriendSuite.class)
public abstract class AbstractFriendTestCase<T extends FriendDriver> implements FriendTestCase<T> {

	private T driver;
	private String baseUrl;

	@Override
	public void initFriendTestCase(final T driver, final String baseUrl) {
		this.driver = driver;
		this.baseUrl = baseUrl;
	}

	@Override
	public T getDriver() {
		return driver;
	}

	@Override
	public String getBaseUrl() {
		return baseUrl;
	}

}
