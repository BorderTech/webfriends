package com.github.bordertech.webfriends.api.common.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element with dimensions.
 */
public interface Dimensionable extends Element {

	/**
	 * @return the element width.
	 */
	int getWidth();

	/**
	 * @return the element height.
	 */
	int getHeight();

}
