package com.github.bordertech.webfriends.api.common.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element with dimensions (ie height and width).
 *
 * @see <a href="https://html.spec.whatwg.org/#dimension-attributes">HTML Spec</a>
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
