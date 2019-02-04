package com.github.bordertech.webfriends.selenium.junit.testcase;

import com.github.bordertech.webfriends.selenium.util.driver.FriendDriver;

/**
 * Friend driver test case.
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
	 * @return the friend driver
	 */
	FriendDriver getDriver();

	/**
	 * @return the base URL for the tests
	 */
	String getBaseUrl();

}
