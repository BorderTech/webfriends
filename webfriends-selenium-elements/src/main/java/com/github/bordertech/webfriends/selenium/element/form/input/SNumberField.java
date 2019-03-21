package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.HNumberField;
import com.github.bordertech.webfriends.selenium.common.form.control.FormNumberControlSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputNumber;

/**
 * Selenium number element.
 */
public class SNumberField extends AbstractSElement implements HNumberField, InputElementSelenium,
		FormNumberControlSelenium {

	@Override
	public STagInputNumber getTagType() {
		return SeleniumTags.INPUT_NUMBER;
	}

}
