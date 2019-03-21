package com.github.bordertech.webfriends.selenium.smart.page;

import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriver;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartHelper;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartHelperProvider;
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
	protected SmartDriver getDriver() {
		return app.getDriver();
	}

	/**
	 * @return the helper provider
	 */
	protected SmartHelperProvider getHelper() {
		return SmartHelper.getProvider();
	}

	/**
	 * @return the condition to verify the correct panel is loaded
	 */
	protected Function<WebDriver, Boolean> getVerifyCondition() {
		return null;
	}

}
