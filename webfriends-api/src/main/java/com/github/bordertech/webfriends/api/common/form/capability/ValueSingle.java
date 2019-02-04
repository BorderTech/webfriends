package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Input element that has a single value.
 */
public interface ValueSingle extends Element {

	/**
	 * @return the value of the element
	 */
	String getValue();

	/**
	 * @param value the value to set on the element
	 */
	void setValue(final String value);

	/**
	 * @return true if element has valid value
	 */
	boolean isValidState();

	/**
	 * Clear the value (ie set to null).
	 */
	void clearValue();

}
