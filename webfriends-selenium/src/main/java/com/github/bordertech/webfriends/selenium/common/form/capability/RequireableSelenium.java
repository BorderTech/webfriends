package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.Requireable;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Element that can be required.
 */
public interface RequireableSelenium extends Requireable, SElement {

	@Override
	public default boolean isRequired() {
		return getAttributeAsBoolean("required");
	}

}
