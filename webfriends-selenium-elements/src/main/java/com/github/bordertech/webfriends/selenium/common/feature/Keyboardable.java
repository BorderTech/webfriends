package com.github.bordertech.webfriends.selenium.common.feature;

import com.github.bordertech.webfriends.selenium.element.SElement;
import org.openqa.selenium.Keys;

/**
 * Element can be driven by the keyboard.
 */
public interface Keyboardable extends SElement {

	/**
	 * Send the enter key.
	 */
	default void sendEnter() {
		sendKey(Keys.ENTER);
	}

	/**
	 * Send the space key.
	 */
	default void sendSpace() {
		sendKey(Keys.SPACE);
	}

	/**
	 * Send the escape key.
	 */
	default void sendEscape() {
		sendKey(Keys.ESCAPE);
	}

	/**
	 * Send a predefined key that is not text.
	 *
	 * @param key the key to send
	 */
	default void sendKey(final Keys key) {
		if (key == null) {
			return;
		}
		focus();
		getWebElement().sendKeys(key);
	}

	/**
	 * The text to type into an element.
	 *
	 * @param text the text to type
	 */
	default void typeText(final String text) {
		if (text == null) {
			return;
		}
		focus();
		getWebElement().sendKeys(text);
	}

	/**
	 * Set focus to this element
	 */
	default void focus() {
		getDriver().setFocus(this);
	}
}
