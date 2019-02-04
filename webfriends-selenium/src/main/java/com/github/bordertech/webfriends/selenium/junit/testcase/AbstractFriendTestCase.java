package com.github.bordertech.webfriends.selenium.junit.testcase;

import com.github.bordertech.webfriends.selenium.junit.runner.FriendRunner;
import com.github.bordertech.webfriends.selenium.util.driver.FriendDriver;
import org.junit.runner.RunWith;

/**
 * Test class that uses the {@link FriendRunner}.
 */
@RunWith(FriendRunner.class)
public class AbstractFriendTestCase implements FriendTestCase {

	private FriendDriver driver;
	private String baseUrl;

	@Override
	public void initFriendTestCase(final FriendDriver driver, final String baseUrl) {
		this.driver = driver;
		this.baseUrl = baseUrl;
	}

	@Override
	public FriendDriver getDriver() {
		return driver;
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

	@Override
	public String getBaseUrl() {
		return baseUrl;
	}

}
