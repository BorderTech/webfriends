package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.HTextField;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputText;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium text input element.
 */
public class STextField extends AbstractSElement implements HTextField, InputTextSuggestionsElementSelenium {

	@Override
	public STagInputText getTagType() {
		return SeleniumTags.INPUT_TEXT;
	}

}
