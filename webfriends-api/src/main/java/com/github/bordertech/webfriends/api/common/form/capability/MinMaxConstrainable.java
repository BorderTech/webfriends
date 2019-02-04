package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that has min and max value constraints.
 *
 * @param <T> the element value data type
 */
public interface MinMaxConstrainable<T> extends Element {

	/**
	 * @return the minimum value as String, or null
	 */
	String getMinValue();

	/**
	 * @return the minimum value as element data type, or null
	 */
	T getMinValueAsType();

	/**
	 * @return the maximum value as String, or null
	 */
	String getMaxValue();

	/**
	 * @return the maximum value as element data type, or null
	 */
	T getMaxValueAsType();

}
