package com.github.bordertech.webfriends.selenium.util.driver;

/**
 * Friend test case used by the unit test runners.
 */
public interface FriendTestCase {

	/**
	 * Initialize the test case.
	 *
	 * @param driver the friend web driver
	 * @param baseUrl the base URL for the tests
	 */
	void initFriendTestCase(final FriendDriver driver, final String baseUrl);

	/**
	 * @return the runner driver
	 */
	FriendDriver getDriver();

	/**
	 * @return the base URL for the tests
	 */
	String getBaseUrl();

}
