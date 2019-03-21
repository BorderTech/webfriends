package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.Autofocusable;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Element that can be auto focused.
 */
public interface AutofocusableSelenium extends Autofocusable, SElement {

	@Override
	default boolean isAutofocus() {
		return getAttributeAsBoolean("autofocus");
	}

}
