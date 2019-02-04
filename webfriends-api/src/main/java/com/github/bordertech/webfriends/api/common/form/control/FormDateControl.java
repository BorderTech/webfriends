package com.github.bordertech.webfriends.api.common.form.control;

import com.github.bordertech.webfriends.api.common.form.capability.Autocompleteable;
import com.github.bordertech.webfriends.api.common.form.capability.MinMaxConstrainableDate;
import com.github.bordertech.webfriends.api.common.form.capability.Readonlyable;
import com.github.bordertech.webfriends.api.common.form.capability.Requireable;
import com.github.bordertech.webfriends.api.common.form.capability.Stepable;
import com.github.bordertech.webfriends.api.common.form.capability.Suggestable;
import com.github.bordertech.webfriends.api.common.form.capability.ValueDate;

/**
 * Form date control.
 */
public interface FormDateControl extends FormControl,
		Autocompleteable, MinMaxConstrainableDate, Readonlyable, Requireable, Stepable, Suggestable, ValueDate {

}
