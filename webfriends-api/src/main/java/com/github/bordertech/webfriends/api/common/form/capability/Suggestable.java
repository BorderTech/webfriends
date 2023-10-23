package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;
import com.github.bordertech.webfriends.api.element.form.select.HDatalist;

/**
 * Element with a list of predefined suggestions.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/text#list">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-list-attribute">HTML Spec</a>
 */
public interface Suggestable extends Element {

	/**
	 * @return true if has suggestions
	 */
	boolean hasSuggestions();

	/**
	 * @return the suggestions
	 */
	HDatalist getDataList();

}
