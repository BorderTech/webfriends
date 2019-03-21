package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.control.FormNumberControl;
import com.github.bordertech.webfriends.api.common.tags.TagInputNumber;

/**
 * Input number element.
 */
public interface HNumberField extends InputElement, FormNumberControl {

	@Override
	TagInputNumber getTagType();

	@Override
	public default InputType getInputType() {
		return InputType.NUMBER;
	}
}
