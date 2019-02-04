package com.github.bordertech.webfriends.api.common.form.control;

import com.github.bordertech.webfriends.api.common.capability.Focusable;
import com.github.bordertech.webfriends.api.common.category.InteractiveContent;
import com.github.bordertech.webfriends.api.common.category.Labelable;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.category.PhrasingContent;
import com.github.bordertech.webfriends.api.common.context.PhrasingContext;
import com.github.bordertech.webfriends.api.common.form.capability.Autofocusable;
import com.github.bordertech.webfriends.api.common.form.capability.Dirtyable;
import com.github.bordertech.webfriends.api.common.form.capability.Disableable;
import com.github.bordertech.webfriends.api.common.form.capability.ValueSingle;
import com.github.bordertech.webfriends.api.common.form.category.AutocapitalizeInheriting;
import com.github.bordertech.webfriends.api.common.form.category.Listed;
import com.github.bordertech.webfriends.api.common.form.category.Resettable;
import com.github.bordertech.webfriends.api.common.form.category.Submittable;

/**
 * Form interactive control.
 */
public interface FormControl extends PhrasingContent, InteractiveContent, PalpableContent,
		PhrasingContext,
		Listed, Labelable, Submittable, Resettable, AutocapitalizeInheriting,
		Focusable, Autofocusable, Dirtyable, Disableable, ValueSingle {

}
