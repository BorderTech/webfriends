package com.github.bordertech.webfriends.selenium.common.feature;

import com.github.bordertech.webfriends.selenium.element.SElement;
import com.github.bordertech.webfriends.selenium.element.form.SButton;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriverUtil;

/**
 * Element with child button elements.
 */
public interface ContainerWithButtons extends SElement {

	/**
	 * Find a button with the matching text.
	 *
	 * @param text the text of the button
	 * @return the button element or null
	 */
	default SButton findButton(final String text) {
		return findButton(text, false);
	}

	/**
	 * Find a button with the matching text.
	 *
	 * @param text the text of the button
	 * @param partial true if partial match
	 * @return the button element or null
	 */
	default SButton findButton(final String text, final boolean partial) {
		return SmartDriverUtil.findButton(getDriver(), getWebElement(), text, partial);
	}

}
