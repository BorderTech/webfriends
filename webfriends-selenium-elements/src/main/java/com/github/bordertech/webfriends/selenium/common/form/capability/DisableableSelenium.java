package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.Disableable;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Element that can be disabled.
 */
public interface DisableableSelenium extends Disableable, SElement {

	@Override
	default boolean isDisabled() {
		return !getWebElement().isEnabled();
	}

}
