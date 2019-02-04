package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that allows the input to be checked against a regular expression.
 */
public interface Patternable extends Element {

	/**
	 * @return the regular expression against the control value, or null
	 */
	String getPattern();

}
