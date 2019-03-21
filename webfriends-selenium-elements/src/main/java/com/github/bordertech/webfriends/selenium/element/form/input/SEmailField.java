package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.HEmailField;
import com.github.bordertech.webfriends.selenium.common.form.capability.ValueMultiSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import java.util.List;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputEmail;

/**
 * Selenium email input element.
 */
public class SEmailField extends AbstractSElement implements HEmailField, InputTextSuggestionsElementSelenium,
		ValueMultiSelenium {

	@Override
	public STagInputEmail getTagType() {
		return SeleniumTags.INPUT_EMAIL;
	}

	@Override
	public void setValues(final List<String> values) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void setValues(final String[] values) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
