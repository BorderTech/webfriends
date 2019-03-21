package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.capability.Checkable;
import com.github.bordertech.webfriends.api.common.form.capability.Requireable;
import com.github.bordertech.webfriends.api.common.tags.TagInputCheckbox;

/**
 * CheckBox input element.
 */
public interface HCheckBox extends InputElement, Checkable, Requireable {

	@Override
	TagInputCheckbox getTagType();

	@Override
	public default InputType getInputType() {
		return InputType.CHECKBOX;
	}

}
