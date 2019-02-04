package com.github.bordertech.webfriends.selenium.page;

import com.github.bordertech.webfriends.selenium.util.driver.FriendDriver;
import com.github.bordertech.webfriends.selenium.util.helper.Helper;
import com.github.bordertech.webfriends.selenium.util.helper.HelperProvider;
import java.util.function.Function;
import org.openqa.selenium.WebDriver;

/**
 * Test panel used in a {@link TPage}.
 *
 * @param <T> the application type
 * @param <P> the panel type
 */
public class TPanel<T extends TApp, P extends TPanel<T, P>> {

	private final T app;

	/**
	 * @param app the application
	 */
	public TPanel(final T app) {
		this.app = app;
	}

	/**
	 * Verify panel loaded.
	 */
	public P verifyPanel() {
		getDriver().verifyPageLoaded(getVerifyCondition());
		return (P) this;
	}

	/**
	 * @return the test application
	 */
	protected T getApp() {
		return app;
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
	 * @return the condition to verify the correct panel is loaded
	 */
	protected Function<WebDriver, Boolean> getVerifyCondition() {
		return null;
	}

}
