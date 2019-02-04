package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.capability.Autocompleteable;
import com.github.bordertech.webfriends.api.common.form.capability.Suggestable;
import com.github.bordertech.webfriends.api.common.form.capability.ValueColor;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Input color element.
 */
public interface HColorField extends InputElement, Autocompleteable, Suggestable, ValueColor {

	@Override
	public default ElementTag<? extends HColorField> getElementTag() {
		return StandardTags.INPUT_COLOR;
	}

	@Override
	public default InputType getInputType() {
		return InputType.COLOR;
	}
}
