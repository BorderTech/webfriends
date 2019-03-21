package com.github.bordertech.webfriends.selenium.common.feature;

import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Element can be clicked.
 */
public interface Clickable extends SElement {

	/**
	 * Click the element and wait for the page to be ready.
	 */
	default void click() {
		getDriver().focusWindow();
		getWebElement().click();
		getDriver().waitForPageReady();
	}

	/**
	 * Click the element and do not wait for page ready.
	 */
	default void clickNoWait() {
		getDriver().focusWindow();
		getWebElement().click();
	}

}
