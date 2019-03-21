package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.HUrlField;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputUrl;

/**
 * Selenium URL input element.
 */
public class SUrlField extends AbstractSElement implements HUrlField, InputTextSuggestionsElementSelenium {

	@Override
	public STagInputUrl getTagType() {
		return SeleniumTags.INPUT_URL;
	}

}
