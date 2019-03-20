package com.github.bordertech.webfriends.selenium.smart.junit;

import com.github.bordertech.webfriends.selenium.smart.page.TApp;

/**
 * Abstract page test.
 *
 * @param <T> the application type
 */
public abstract class AbstractPageTestCase<T extends TApp> extends AbstractFriendTestCase {

	private T app = null;

	public T getApp() {
		if (app == null) {
			app = createApp();
		}
		return app;
	}

	protected abstract T createApp();

}