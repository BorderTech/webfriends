package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element can be readonly.
 */
public interface Readonlyable extends Element {

	/**
	 * @return true if user cannot interact with the form control
	 */
	boolean isReadonly();

}
