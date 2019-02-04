package com.github.bordertech.webfriends.api.common.form.control;

import com.github.bordertech.webfriends.api.common.form.capability.Autocompleteable;
import com.github.bordertech.webfriends.api.common.form.capability.MinMaxConstrainableNumber;
import com.github.bordertech.webfriends.api.common.form.capability.Placeholderable;
import com.github.bordertech.webfriends.api.common.form.capability.Readonlyable;
import com.github.bordertech.webfriends.api.common.form.capability.Requireable;
import com.github.bordertech.webfriends.api.common.form.capability.Stepable;
import com.github.bordertech.webfriends.api.common.form.capability.Suggestable;
import com.github.bordertech.webfriends.api.common.form.capability.ValueNumber;

/**
 * Form number control.
 */
public interface FormNumberControl extends FormControl,
		Autocompleteable, MinMaxConstrainableNumber, Readonlyable, Placeholderable,
		Requireable, Stepable, Suggestable, ValueNumber {

}
