package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.HTelephoneField;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputTelephone;

/**
 * Telephone input element.
 */
public class STelephoneField extends AbstractSElement implements HTelephoneField, InputTextSuggestionsElementSelenium {

	@Override
	public STagInputTelephone getTagType() {
		return SeleniumTags.INPUT_TELEPHONE;
	}

}
