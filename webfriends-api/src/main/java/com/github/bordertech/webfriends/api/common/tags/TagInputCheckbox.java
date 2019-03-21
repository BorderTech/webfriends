package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagInputType;
import com.github.bordertech.webfriends.api.element.form.input.HCheckBox;
import com.github.bordertech.webfriends.api.element.form.input.InputElement;

/**
 * HTML <code>input</code> checkbox tag.
 *
 * @param <T> the element type
 */
public interface TagInputCheckbox<T extends HCheckBox> extends TagInputType<T> {

	@Override
	public default InputElement.InputType getInputType() {
		return InputElement.InputType.CHECKBOX;
	}

}
