package com.github.bordertech.webfriends.api.common.form.capability;

import java.util.List;

/**
 * Element that allows the user to specify more than one value.
 */
public interface ValueMulti extends ValueSingle {

	/**
	 * @return true if the user can specify more than one value
	 */
	boolean isMultiple();

	/**
	 * @return the list of values or empty list
	 */
	List<String> getValues();

	/**
	 * @param values the values to set
	 */
	void setValues(final List<String> values);

	/**
	 * @param values the values to set
	 */
	void setValues(final String[] values);

}
