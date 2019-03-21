package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.capability.Autocompleteable;
import com.github.bordertech.webfriends.api.common.form.capability.Suggestable;
import com.github.bordertech.webfriends.api.common.form.capability.ValueColor;
import com.github.bordertech.webfriends.api.common.tags.TagInputColor;

/**
 * Input color element.
 */
public interface HColorField extends InputElement, Autocompleteable, Suggestable, ValueColor {

	@Override
	TagInputColor getTagType();

	@Override
	public default InputType getInputType() {
		return InputType.COLOR;
	}
}
