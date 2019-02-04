package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.control.FormNumberControl;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Input number element.
 */
public interface HNumberField extends InputElement, FormNumberControl {

	@Override
	public default ElementTag<? extends HNumberField> getElementTag() {
		return StandardTags.INPUT_NUMBER;
	}

	@Override
	public default InputType getInputType() {
		return InputType.NUMBER;
	}
}
