package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that can be disabled.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/disabled">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#enabling-and-disabling-form-controls:-the-disabled-attribute">HTML Spec</a>
 */
public interface Disableable extends Element {

	/**
	 * @return true if disabled
	 */
	boolean isDisabled();

}
