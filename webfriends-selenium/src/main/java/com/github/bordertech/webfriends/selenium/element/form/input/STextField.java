package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.HTextField;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium text input element.
 */
public class STextField extends AbstractSElement implements HTextField, InputTextSuggestionsElementSelenium {

	@Override
	public SeleniumTag<? extends STextField> getElementTag() {
		return SeleniumTags.INPUT_TEXT;
	}

}
