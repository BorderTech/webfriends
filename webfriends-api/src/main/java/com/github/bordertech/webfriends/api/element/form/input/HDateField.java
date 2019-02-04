package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.control.FormDateControl;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Date input element.
 */
public interface HDateField extends InputElement, FormDateControl {

	@Override
	public default ElementTag<? extends HDateField> getElementTag() {
		return StandardTags.INPUT_DATE;
	}

	@Override
	public default InputType getInputType() {
		return InputType.DATE;
	}

}
