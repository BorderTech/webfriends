package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.HSearchField;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputSearch;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium search input element.
 */
public class SSearchField extends AbstractSElement implements HSearchField, InputTextSuggestionsElementSelenium {

	@Override
	public STagInputSearch getTagType() {
		return SeleniumTags.INPUT_SEARCH;
	}

}
