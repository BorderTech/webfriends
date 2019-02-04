package com.github.bordertech.webfriends.selenium.page;

import com.github.bordertech.webfriends.selenium.util.driver.FriendDriver;
import com.github.bordertech.webfriends.selenium.util.helper.Helper;
import com.github.bordertech.webfriends.selenium.util.helper.HelperProvider;

/**
 * Test Application that holds the test pages for an Application.
 */
public abstract class TApp {

	private final FriendDriver driver;
	private final String baseUrl;

	public TApp(final FriendDriver driver, final String baseUrl) {
		this.driver = driver;
		this.baseUrl = baseUrl;
	}

	/**
	 * Start a new session by launching the default page.
	 *
	 * @return the default page
	 */
	public TPage newSession() {
		getDriver().newSession();
		return getDefaultPage().navigateToPage();
	}

	/**
	 * Close the current window.
	 */
	public void close() {
		getDriver().close();
	}

	/**
	 * Close all windows.
	 */
	public void quit() {
		getDriver().quit();
	}

	/**
	 * @return the backing friend driver
	 */
	public FriendDriver getDriver() {
		return driver;
	}

	/**
	 * @return the server base URL
	 */
	public String getBaseUrl() {
		return baseUrl;
	}

	/**
	 * @return the helper
	 */
	protected HelperProvider getHelper() {
		return Helper.getProvider();
	}

	/**
	 * @return the default page
	 */
	protected abstract TPage getDefaultPage();

	/**
	 * Wait for the page ready.
	 */
	protected void waitForPageReady() {
		getDriver().waitForPageReady();
	}

}
