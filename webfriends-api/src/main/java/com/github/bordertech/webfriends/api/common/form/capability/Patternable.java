package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that allows the input to be checked against a regular expression.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/pattern">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-pattern-attribute">HTML Spec</a>
 */
public interface Patternable extends Element {

	/**
	 * @return the regular expression against the control value, or null
	 */
	String getPattern();

}
