package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.HRangeField;
import com.github.bordertech.webfriends.selenium.common.form.capability.AutocompleteableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.MinMaxConstrainableNumberSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.StepableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.SuggestableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.ValueNumberSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagInputRange;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium range element.
 */
public class SRangeField extends AbstractSElement implements HRangeField, InputElementSelenium,
		AutocompleteableSelenium, SuggestableSelenium, MinMaxConstrainableNumberSelenium,
		StepableSelenium, ValueNumberSelenium {

	@Override
	public STagInputRange getTagType() {
		return SeleniumTags.INPUT_RANGE;
	}

}
