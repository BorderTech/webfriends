package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.Readonlyable;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Element can be readonly.
 */
public interface ReadonlyableSelenium extends Readonlyable, SElement {

	@Override
	public default boolean isReadonly() {
		return getAttributeAsBoolean("readonly");
	}

}
