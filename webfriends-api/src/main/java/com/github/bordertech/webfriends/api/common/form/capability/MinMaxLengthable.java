package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that has min and max lengths.
 */
public interface MinMaxLengthable extends Element {

	/**
	 * @return the minimum number of characters a user can input, or null
	 */
	Integer getMinLength();

	/**
	 * @return the maximum number of characters a user can input, or null
	 */
	Integer getMaxLength();

}
