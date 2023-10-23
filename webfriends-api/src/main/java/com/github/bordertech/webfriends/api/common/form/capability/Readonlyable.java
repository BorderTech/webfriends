package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element can be readonly.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/readonly">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#attr-input-readonly">HTML Spec</a>
 */
public interface Readonlyable extends Element {

	/**
	 * @return true if user cannot interact with the form control
	 */
	boolean isReadonly();

}
