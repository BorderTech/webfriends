package com.github.bordertech.webfriends.selenium.smart.page;

import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriver;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartHelper;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartHelperProvider;

/**
 * Test Application that holds the test pages for an Application.
 */
public abstract class TApp {

	private final SmartDriver driver;
	private final String baseUrl;

	public TApp(final SmartDriver driver, final String baseUrl) {
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
	public SmartDriver getDriver() {
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
	protected SmartHelperProvider getHelper() {
		return SmartHelper.getProvider();
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
