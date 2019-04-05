package com.github.bordertech.webfriends.selenium.smart.page;

import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriver;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartHelper;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartHelperProvider;
import com.github.bordertech.webfriends.pageobject.ApplicationPageController;

/**
 * Application controller backed by the smart selenium drivers.
 *
 * @param <T> the default page type
 *
 * @see ApplicationPageController
 * @see TPageObject
 */
public abstract class TApplicationPageController<T extends TPageObject> implements ApplicationPageController<T> {

	private final SmartDriver driver;
	private final String baseUrl;

	/**
	 * @param driver the backing smart driver for this test application
	 * @param baseUrl the base URL for the UI
	 */
	public TApplicationPageController(final SmartDriver driver, final String baseUrl) {
		this.driver = driver;
		this.baseUrl = baseUrl;
	}

	@Override
	public T newSession() {
		getDriver().newSession();
		return (T) createDefaultPage().navigateToPage();
	}

	@Override
	public void close() {
		getDriver().close();
	}

	@Override
	public void quit() {
		getDriver().quit();
	}

	/**
	 * @return the server base URL
	 */
	public String getBaseUrl() {
		return baseUrl;
	}

	/**
	 * @return the backing smart driver
	 */
	public SmartDriver getDriver() {
		return driver;
	}

	/**
	 * @return the smart helper
	 */
	public SmartHelperProvider getHelper() {
		return SmartHelper.getProvider();
	}

	/**
	 * @return a new default page instance
	 */
	protected abstract T createDefaultPage();

}
