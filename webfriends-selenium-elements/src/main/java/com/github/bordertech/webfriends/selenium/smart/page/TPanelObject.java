package com.github.bordertech.webfriends.selenium.smart.page;

import com.github.bordertech.webfriends.pageobject.PanelObject;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriver;
import java.util.function.Function;
import org.openqa.selenium.WebDriver;

/**
 * Panel object backed by smart selenium drivers.
 *
 * @param <T> the application controller type
 * @param <P> the panel object type
 *
 * @see PanelObject
 * @see TPageObject
 */
public class TPanelObject<T extends TApplicationPageController, P extends TPanelObject> implements PanelObject<P> {

	private final T app;

	/**
	 * @param app the application controller
	 */
	public TPanelObject(final T app) {
		this.app = app;
	}

	/**
	 * Verify panel loaded.
	 */
	@Override
	public P verifyPanel() {
		getDriver().verifyPageCondition(getVerifyCondition());
		return (P) this;
	}

	/**
	 * @return the test application
	 */
	protected T getApp() {
		return app;
	}

	/**
	 * @return the backing friend driver
	 */
	protected SmartDriver getDriver() {
		return app.getDriver();
	}

	/**
	 * @return the condition to verify the correct panel is loaded
	 */
	protected Function<WebDriver, Boolean> getVerifyCondition() {
		return null;
	}

}
