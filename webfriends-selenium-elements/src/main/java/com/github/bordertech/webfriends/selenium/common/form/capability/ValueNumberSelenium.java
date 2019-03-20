package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.ValueNumber;
import java.math.BigDecimal;

/**
 * Number value accessors.
 */
public interface ValueNumberSelenium extends ValueNumber, ValueSingleSelenium {

	@Override
	public default BigDecimal getValueAsNumber() {
		return getAttributeAsBigDecimal("value");
	}

	@Override
	public default void setValue(final BigDecimal value) {
		if (value == null) {
			clearValue();
		} else {
			typeText(value.toPlainString());
		}
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
