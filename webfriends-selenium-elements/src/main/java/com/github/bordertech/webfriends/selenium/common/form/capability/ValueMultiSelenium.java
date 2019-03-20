package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.ValueMulti;
import java.util.List;

/**
 * Element that allows the user to specify more than one value.
 */
public interface ValueMultiSelenium extends ValueMulti, ValueSingleSelenium {

	@Override
	public default boolean isMultiple() {
		return getAttributeAsBoolean("multiple");
	}

	@Override
	public default List<String> getValues() {
		return getAttributeAsList("value");
	}

	@Override
	public default String getValue() {
		List<String> values = getValues();
		return values.isEmpty() ? null : values.get(0);
	}
}
