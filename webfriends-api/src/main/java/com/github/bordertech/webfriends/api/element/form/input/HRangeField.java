package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.capability.Autocompleteable;
import com.github.bordertech.webfriends.api.common.form.capability.MinMaxConstrainableNumber;
import com.github.bordertech.webfriends.api.common.form.capability.Stepable;
import com.github.bordertech.webfriends.api.common.form.capability.Suggestable;
import com.github.bordertech.webfriends.api.common.form.capability.ValueNumber;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Input range element.
 */
public interface HRangeField extends InputElement,
		Autocompleteable, Suggestable, MinMaxConstrainableNumber, Stepable, ValueNumber {

	@Override
	public default ElementTag<? extends HRangeField> getElementTag() {
		return StandardTags.INPUT_RANGE;
	}

	@Override
	public default InputType getInputType() {
		return InputType.RANGE;
	}
}
