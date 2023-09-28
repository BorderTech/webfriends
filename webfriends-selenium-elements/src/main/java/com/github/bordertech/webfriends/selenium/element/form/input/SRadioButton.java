package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.HRadioButton;
import com.github.bordertech.webfriends.api.element.form.other.RadioButtonGroup;
import com.github.bordertech.webfriends.selenium.common.form.capability.CheckableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.RequireableSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputRadio;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium radio button element.
 */
public class SRadioButton extends AbstractSElement implements HRadioButton, InputElementSelenium,
		CheckableSelenium, RequireableSelenium {

	@Override
	public STagInputRadio getTagType() {
		return SeleniumTags.INPUT_RADIO;
	}

	@Override
	public RadioButtonGroup getRadioButtonGroup() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void setValue(final String value) {
		getWebElement().click();
	}

}
