package com.github.bordertech.webfriends.selenium.util.driver;

/**
 * Friend test case used by the unit test runners.
 *
 * @param <T> the driver type
 */
public interface FriendTestCase<T extends FriendDriver> {

	/**
	 * Initialize the test case.
	 *
	 * @param driver the friend web driver
	 * @param baseUrl the base URL for the tests
	 */
	void initFriendTestCase(final T driver, final String baseUrl);

	/**
	 * @return the runner driver
	 */
	T getDriver();

	/**
	 * @return the base URL for the tests
	 */
	String getBaseUrl();

	/**
	 * Navigate to the path relative to the server base URL.
	 *
	 * @param path the path to navigate to
	 */
	default void navigateToPath(final String path) {
		String url = buildTestUrl(path);
		getDriver().navigateToUrl(url);
	}

	/**
	 * Build the URL with the provided path appended to the server base URL.
	 *
	 * @param path the path of the test resource
	 * @return the path appended to the server base URL
	 */
	default String buildTestUrl(final String path) {
		return getBaseUrl() + path;
	}

}
