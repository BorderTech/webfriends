package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that can be sized.
 */
public interface Sizeable extends Element {

	/**
	 * The number of characters the user is allowed to see.
	 * <p>
	 * Size must be greater than zero, or if not set defaults to 20.
	 * </p>
	 *
	 * @return the number of characters the user is allowed to see, or null
	 */
	Integer getSize();

}
