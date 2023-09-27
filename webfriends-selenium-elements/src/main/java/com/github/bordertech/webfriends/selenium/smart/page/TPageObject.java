package com.github.bordertech.webfriends.selenium.smart.page;

import com.github.bordertech.webfriends.pageobject.PageObject;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriver;
import java.util.function.Function;
import org.openqa.selenium.WebDriver;

/**
 * Page object backed by the smart selenium drivers.
 *
 * @param <T> the application controller type
 * @param <P> the page object type
 *
 * @see PageObject
 * @see TApplicationPageController
 */
public class TPageObject<T extends TApplicationPageController, P extends PageObject> implements PageObject<P> {

	private final T app;
	private final String pagePath;

	/**
	 * @param app the application controller
	 * @param pagePath the relative path to this page
	 */
	public TPageObject(final T app, final String pagePath) {
		this.app = app;
		this.pagePath = pagePath;
	}

	@Override
	public P refreshPage() {
		getDriver().refreshPage();
		return verifyPage();
	}

	@Override
	public P navigateToPage() {
		// TODO UTIL for concat
		String url = getApp().getBaseUrl() + getPagePath();
		getDriver().navigateToUrl(url);
		return verifyPage();
	}

	/**
	 * Verify page loaded correctly.
	 *
	 * @return this page for chaining
	 */
	@Override
	public P verifyPage() {
		// Make sure page is ready before verifying
		waitForPageReady();
		// Verify the page
		getDriver().verifyPageCondition(getVerifyCondition());
		return (P) this;
	}

	/**
	 * @return the page title
	 */
	@Override
	public String getPageTitle() {
		return getDriver().getPageTitle();
	}

	/**
	 * Send tab forward key.
	 */
	public void sendTabForward() {
		getDriver().sendTabForward();
	}

	/**
	 * Send tab backwards key.
	 */
	public void sendTabBackward() {
		getDriver().sendTabBackward();
	}

	/**
	 * Wait for the page ready.
	 *
	 * @return this page for chaining
	 */
	protected P waitForPageReady() {
		getDriver().waitForPageReady();
		return (P) this;
	}

	/**
	 * @return the relative path to this page.
	 */
	protected String getPagePath() {
		return pagePath;
	}

	/**
	 * @param key the access key
	 */
	protected void sendAccessKey(final String key) {
		getDriver().sendAccessKey(key);
	}

	/**
	 * @return the condition to verify the correct page is loaded
	 */
	protected Function<WebDriver, Boolean> getVerifyCondition() {
		return null;
	}

	/**
	 * @return the application controller
	 */
	protected T getApp() {
		return app;
	}

	/**
	 * @return the backing friend driver
	 */
	protected SmartDriver getDriver() {
		return getApp().getDriver();
	}

}
