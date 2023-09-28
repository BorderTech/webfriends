package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.HColorField;
import com.github.bordertech.webfriends.selenium.common.form.capability.AutocompleteableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.SuggestableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.ValueColorSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputColor;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium color element.
 */
public class SColorField extends AbstractSElement implements HColorField, InputElementSelenium,
		AutocompleteableSelenium, SuggestableSelenium, ValueColorSelenium {

	@Override
	public STagInputColor getTagType() {
		return SeleniumTags.INPUT_COLOR;
	}

}
