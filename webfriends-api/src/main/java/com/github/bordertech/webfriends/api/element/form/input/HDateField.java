package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.control.FormDateControl;
import com.github.bordertech.webfriends.api.common.tags.TagInputDate;

/**
 * Date input element.
 */
public interface HDateField extends InputElement, FormDateControl {

	@Override
	TagInputDate getTagType();

	@Override
	public default InputType getInputType() {
		return InputType.DATE;
	}

}
