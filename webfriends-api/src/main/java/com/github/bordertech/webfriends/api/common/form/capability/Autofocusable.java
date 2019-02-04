package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that can be auto focused.
 */
public interface Autofocusable extends Element {

	/**
	 * @return true if auto focused
	 */
	boolean isAutofocus();

}
