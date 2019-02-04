package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.ValueColor;

/**
 * Color value accessors.
 */
public interface ValueColorSelenium extends ValueColor, ValueSingleSelenium {

	@Override
	public default String getValueAsColor() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public default void setValueAsColor(final String color) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public default void setValue(final String value) {
		if (value == null) {
			clearValue();
		} else {
			typeText(value);
		}
	}

}
