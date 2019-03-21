package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.ValueDate;
import java.util.Date;

/**
 * Date value accessors.
 */
public interface ValueDateSelenium extends ValueDate, ValueSingleSelenium {

	@Override
	default Date getValueAsDate() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	default void setValue(final Date date) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	default void setValue(int year, int month, int day) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	default void setValue(final String value) {
		if (value == null) {
			clearValue();
		} else {
			typeText(value);
		}
	}

}
