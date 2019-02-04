package com.github.bordertech.webfriends.api.common.form.control;

import com.github.bordertech.webfriends.api.common.form.capability.Autocompleteable;
import com.github.bordertech.webfriends.api.common.form.capability.MinMaxLengthable;
import com.github.bordertech.webfriends.api.common.form.capability.Patternable;
import com.github.bordertech.webfriends.api.common.form.capability.Placeholderable;
import com.github.bordertech.webfriends.api.common.form.capability.Readonlyable;
import com.github.bordertech.webfriends.api.common.form.capability.Requireable;
import com.github.bordertech.webfriends.api.common.form.capability.Sizeable;

/**
 * Form text control.
 */
public interface FormTextControl extends FormControl,
		Autocompleteable, MinMaxLengthable, Patternable, Placeholderable, Readonlyable, Requireable, Sizeable {

}
