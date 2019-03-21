package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.HDatetimeField;
import com.github.bordertech.webfriends.selenium.common.form.control.FormDateControlSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputDateTime;

/**
 * Selenium date time element.
 */
public class SDatetimeField extends AbstractSElement implements HDatetimeField, InputElementSelenium,
		FormDateControlSelenium {

	@Override
	public STagInputDateTime getTagType() {
		return SeleniumTags.INPUT_DATETIME;
	}

	@Override
	public void setValue(final int year, final int month, final int day, final int hour, final int minutes, final int seconds) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
