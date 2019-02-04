package com.github.bordertech.webfriends.selenium.common.form.control;

import com.github.bordertech.webfriends.api.common.form.control.FormTextControl;
import com.github.bordertech.webfriends.selenium.common.form.capability.AutocompleteableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.MinMaxLengthableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.PatternableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.PlaceholderableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.ReadonlyableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.RequireableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.SizeableSelenium;

/**
 * Form text control.
 */
public interface FormTextControlSelenium extends FormTextControl, FormControlSelenium,
		AutocompleteableSelenium, MinMaxLengthableSelenium, PatternableSelenium, PlaceholderableSelenium,
		ReadonlyableSelenium, RequireableSelenium, SizeableSelenium {

	@Override
	public default void setValue(final String value) {
		if (value == null) {
			clearValue();
		} else {
			typeText(value);
		}
	}

}
