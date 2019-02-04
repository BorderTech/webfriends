package com.github.bordertech.webfriends.api.common.form.capability;

import java.math.BigDecimal;

/**
 * Number value accessors.
 */
public interface ValueNumber extends ValueSingle {

	/**
	 * @return the value as a number
	 */
	BigDecimal getValueAsNumber();

	/**
	 * @param value the number value to set
	 */
	void setValue(final BigDecimal value);

}
