package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.HCheckBox;
import com.github.bordertech.webfriends.selenium.common.form.capability.CheckableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.RequireableSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputCheckbox;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium CheckBox element.
 */
public class SCheckBox extends AbstractSElement implements HCheckBox, InputElementSelenium,
		CheckableSelenium, RequireableSelenium {

	@Override
	public STagInputCheckbox getTagType() {
		return SeleniumTags.INPUT_CHECKBOX;
	}

	@Override
	public void setValue(final String value) {
		setChecked(Boolean.parseBoolean(value));
	}

}
