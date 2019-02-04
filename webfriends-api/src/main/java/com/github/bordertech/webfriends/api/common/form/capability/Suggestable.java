package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;
import com.github.bordertech.webfriends.api.element.form.select.HDatalist;

/**
 * Element with a list of predefined suggestions.
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
