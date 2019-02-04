package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that can be required.
 */
public interface Requireable extends Element {

	/**
	 * @return true if required
	 */
	boolean isRequired();

}
