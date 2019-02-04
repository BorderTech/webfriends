package com.github.bordertech.webfriends.selenium.page;

import com.github.bordertech.webfriends.selenium.util.driver.FriendDriver;
import com.github.bordertech.webfriends.selenium.util.helper.Helper;
import com.github.bordertech.webfriends.selenium.util.helper.HelperProvider;
import java.util.function.Function;
import org.openqa.selenium.WebDriver;

/**
 * Test page used in a {@link TApp}.
 *
 * @param <T> the test application type
 * @param <P> the page type
 */
public abstract class TPage<T extends TApp, P extends TPage<T, P>> {

	private final T app;

	/**
	 * @param app the application
	 */
	public TPage(final T app) {
		this.app = app;
	}

	/**
	 * Refresh page.
	 */
	public P refreshPage() {
		getDriver().refreshPage();
		return verifyPage();
	}

	/**
	 * Navigate to this page.
	 */
	public P navigateToPage() {
		// TODO UTIL for concat
		String url = getApp().getBaseUrl() + getPagePath();
		getDriver().navigateToUrl(url);
		return verifyPage();
	}

	/**
	 * @return the page title
	 */
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
	 * Verify page loaded.
	 */
	public P verifyPage() {
		getDriver().verifyPageLoaded(getVerifyCondition());
		return (P) this;
	}

	/**
	 * @return the relative path to this page.
	 */
	protected abstract String getPagePath();

	/**
	 * @param key the access key
	 */
	protected void sendAccessKey(final String key) {
		getDriver().sendAccessKey(key);
	}

	/**
	 * Wait for the page ready.
	 */
	protected void waitForPageReady() {
		getDriver().waitForPageReady();
	}

	/**
	 * @return the backing friend driver
	 */
	protected FriendDriver getDriver() {
		return app.getDriver();
	}

	/**
	 * @return the helper provider
	 */
	protected HelperProvider getHelper() {
		return Helper.getProvider();
	}

	/**
	 * @return the condition to verify the correct page is loaded
	 */
	protected Function<WebDriver, Boolean> getVerifyCondition() {
		return null;
	}

	/**
	 * @return the test application
	 */
	protected T getApp() {
		return app;
	}

}
