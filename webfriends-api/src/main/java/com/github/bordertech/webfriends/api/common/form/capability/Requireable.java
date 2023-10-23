package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that can be required.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/required">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-required-attribute">HTML Spec</a>
 */
public interface Requireable extends Element {

	/**
	 * @return true if required
	 */
	boolean isRequired();

}
