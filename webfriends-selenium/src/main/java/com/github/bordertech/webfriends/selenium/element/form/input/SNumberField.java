package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.HNumberField;
import com.github.bordertech.webfriends.selenium.common.form.control.FormNumberControlSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium number element.
 */
public class SNumberField extends AbstractSElement implements HNumberField, InputElementSelenium,
		FormNumberControlSelenium {

	@Override
	public SeleniumTag<? extends SNumberField> getElementTag() {
		return SeleniumTags.INPUT_NUMBER;
	}

}
