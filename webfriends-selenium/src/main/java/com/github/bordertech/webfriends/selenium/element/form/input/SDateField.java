package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.HDateField;
import com.github.bordertech.webfriends.selenium.common.form.control.FormDateControlSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium date element.
 */
public class SDateField extends AbstractSElement implements HDateField, InputElementSelenium,
		FormDateControlSelenium {

	@Override
	public SeleniumTag<? extends SDateField> getElementTag() {
		return SeleniumTags.INPUT_DATE;
	}

}
