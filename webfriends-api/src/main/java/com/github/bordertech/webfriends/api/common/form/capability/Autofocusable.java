package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that can be auto focused.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/autofocus">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-autofocus-attribute">HTML Spec</a>
 */
public interface Autofocusable extends Element {

	/**
	 * @return true if auto focused
	 */
	boolean isAutofocus();

}
