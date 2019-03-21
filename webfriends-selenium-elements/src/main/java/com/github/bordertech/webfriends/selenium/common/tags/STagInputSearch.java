package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagInputSearch;
import com.github.bordertech.webfriends.selenium.element.form.input.SSearchField;

/**
 * HTML <code>input</code> search tag.
 */
public class STagInputSearch extends AbstractInputTag<SSearchField> implements TagInputSearch<SSearchField> {

	/**
	 * Default constructor.
	 */
	public STagInputSearch() {
		super(SSearchField.class);
	}

}
