package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that can be disabled.
 */
public interface Disableable extends Element {

	/**
	 * @return true if disabled
	 */
	boolean isDisabled();

}
