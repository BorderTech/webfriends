package com.github.bordertech.webfriends.selenium.common.form.control;

import com.github.bordertech.webfriends.api.common.form.control.FormControl;
import com.github.bordertech.webfriends.selenium.common.capability.FocusableSelenium;
import com.github.bordertech.webfriends.selenium.common.category.LabelableSelenium;
import com.github.bordertech.webfriends.selenium.common.feature.Clickable;
import com.github.bordertech.webfriends.selenium.common.feature.Keyboardable;
import com.github.bordertech.webfriends.selenium.common.form.capability.AutofocusableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.DirtyableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.DisableableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.ValueSingleSelenium;
import com.github.bordertech.webfriends.selenium.common.form.category.FormAssociatedSelenium;

/**
 * Form interactive control.
 */
public interface FormControlSelenium extends FormControl,
		LabelableSelenium, FormAssociatedSelenium,
		AutofocusableSelenium, DirtyableSelenium, DisableableSelenium, ValueSingleSelenium,
		FocusableSelenium, Clickable, Keyboardable {
}
