package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.HTelephoneField;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Telephone input element.
 */
public class STelephoneField extends AbstractSElement implements HTelephoneField, InputTextSuggestionsElementSelenium {

	@Override
	public SeleniumTag<? extends STelephoneField> getElementTag() {
		return SeleniumTags.INPUT_TELEPHONE;
	}

}
