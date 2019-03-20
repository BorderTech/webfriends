package com.github.bordertech.webfriends.selenium.common.form.control;

import com.github.bordertech.webfriends.api.common.form.control.FormNumberControl;
import com.github.bordertech.webfriends.selenium.common.form.capability.AutocompleteableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.MinMaxConstrainableNumberSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.PlaceholderableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.ReadonlyableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.RequireableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.StepableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.SuggestableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.ValueNumberSelenium;

/**
 * Form number control.
 */
public interface FormNumberControlSelenium extends FormNumberControl, FormControlSelenium,
		AutocompleteableSelenium, MinMaxConstrainableNumberSelenium, ReadonlyableSelenium, PlaceholderableSelenium,
		RequireableSelenium, StepableSelenium, SuggestableSelenium, ValueNumberSelenium {

}
