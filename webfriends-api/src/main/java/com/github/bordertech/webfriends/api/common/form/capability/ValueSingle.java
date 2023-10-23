package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Input element that has a single value.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input#value">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#concept-fe-value">HTML Spec</a>
 */
public interface ValueSingle extends Element {

	/**
	 * @return the value of the element
	 */
	String getValue();

	/**
	 * @param value the value to set on the element
	 */
	void setValue(final String value);

	/**
	 * @return true if element has valid value
	 */
	boolean isValidState();

	/**
	 * Clear the value (ie set to null).
	 */
	void clearValue();

}
