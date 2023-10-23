package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that has min and max value constraints.
 *
 * @param <T> the element value data type
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/min">Web Docs min</a>
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/max">Web Docs max</a>
 * @see <a href="https://html.spec.whatwg.org/#the-min-and-max-attributes">HTML Spec</a>
 */
public interface MinMaxConstrainable<T> extends Element {

	/**
	 * @return the minimum value as String, or null
	 */
	String getMinValue();

	/**
	 * @return the minimum value as element data type, or null
	 */
	T getMinValueAsType();

	/**
	 * @return the maximum value as String, or null
	 */
	String getMaxValue();

	/**
	 * @return the maximum value as element data type, or null
	 */
	T getMaxValueAsType();

}
