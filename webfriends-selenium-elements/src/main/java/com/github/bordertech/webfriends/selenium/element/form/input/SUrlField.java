package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.HUrlField;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium URL input element.
 */
public class SUrlField extends AbstractSElement implements HUrlField, InputTextSuggestionsElementSelenium {

	@Override
	public SeleniumTag<? extends SUrlField> getElementTag() {
		return SeleniumTags.INPUT_URL;
	}

}
