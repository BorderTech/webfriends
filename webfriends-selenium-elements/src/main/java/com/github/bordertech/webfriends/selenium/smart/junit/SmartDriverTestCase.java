package com.github.bordertech.webfriends.selenium.smart.junit;

import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriver;
import com.github.bordertech.webfriends.selenium.util.driver.FriendDriver;
import com.github.bordertech.webfriends.selenium.util.driver.FriendTestCase;
import com.github.bordertech.webfriends.selenium.util.junit.FriendSuite;
import org.junit.runner.RunWith;

/**
 * Test class that uses the {@link FriendSuite}.
 */
@RunWith(FriendSuite.class)
public class SmartDriverTestCase implements FriendTestCase {

	private SmartDriver driver;
	private String baseUrl;

	@Override
	public void initFriendTestCase(final FriendDriver driver, final String baseUrl) {
		this.driver = (SmartDriver) driver;
		this.baseUrl = baseUrl;
	}

	@Override
	public SmartDriver getDriver() {
		return driver;
	}

	@Override
	public String getBaseUrl() {
		return baseUrl;
	}

	protected void navigateToPath(final String path) {
		String url = buildTestUrl(path);
		getDriver().navigateToUrl(url);
	}

	/**
	 * @param path the path of the test resource
	 * @return the path append to the server base URL
	 */
	protected String buildTestUrl(final String path) {
		return getBaseUrl() + path;
	}

}
