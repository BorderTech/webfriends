package com.github.bordertech.webfriends.selenium.common.form.control;

import com.github.bordertech.webfriends.api.common.form.control.FormDateControl;
import com.github.bordertech.webfriends.selenium.common.form.capability.AutocompleteableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.MinMaxConstrainableDateSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.ReadonlyableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.RequireableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.StepableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.SuggestableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.ValueDateSelenium;

/**
 * Form date control.
 */
public interface FormDateControlSelenium extends FormDateControl, FormControlSelenium,
		AutocompleteableSelenium, MinMaxConstrainableDateSelenium, ReadonlyableSelenium, RequireableSelenium,
		StepableSelenium, SuggestableSelenium, ValueDateSelenium {

}
