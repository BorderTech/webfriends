package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.Checkable;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Element is checkable.
 */
public interface CheckableSelenium extends Checkable, SElement {

	@Override
	default boolean isChecked() {
		return getAttributeAsBoolean("checked");
	}

	@Override
	default void setChecked(final boolean checked) {
		if (checked != isChecked()) {
			getWebElement().click();
		}
	}

}
