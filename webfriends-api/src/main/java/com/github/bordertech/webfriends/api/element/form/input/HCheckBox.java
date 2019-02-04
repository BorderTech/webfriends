package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.capability.Checkable;
import com.github.bordertech.webfriends.api.common.form.capability.Requireable;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * CheckBox input element.
 */
public interface HCheckBox extends InputElement, Checkable, Requireable {

	@Override
	public default ElementTag<? extends HCheckBox> getElementTag() {
		return StandardTags.INPUT_CHECKBOX;
	}

	@Override
	public default InputType getInputType() {
		return InputType.CHECKBOX;
	}

}
