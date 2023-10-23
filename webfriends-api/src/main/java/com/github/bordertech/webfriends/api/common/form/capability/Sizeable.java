package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that can be sized.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/size">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#attr-input-size">HTML Spec</a>
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
