package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.HPasswordField;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputPassword;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium password input element.
 */
public class SPasswordField extends AbstractSElement implements HPasswordField, InputTextElementSelenium {

	@Override
	public STagInputPassword getTagType() {
		return SeleniumTags.INPUT_PASSWORD;
	}

}
