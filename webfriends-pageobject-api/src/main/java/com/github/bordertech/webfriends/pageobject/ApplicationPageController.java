package com.github.bordertech.webfriends.pageobject;

/**
 * Application controllers launch and configure the application page objects.
 *
 * @param <T> the default page type
 *
 * @see PageObject
 */
public interface ApplicationPageController<T extends PageObject> {

	/**
	 * Start a new session and return the default page.
	 *
	 * @return the default page
	 */
	T newSession();

	/**
	 * Close the current window.
	 */
	void close();

	/**
	 * Close all windows.
	 */
	void quit();

}
