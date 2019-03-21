package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagInputType;
import com.github.bordertech.webfriends.api.element.form.input.HNumberField;
import com.github.bordertech.webfriends.api.element.form.input.InputElement;

/**
 * HTML <code>input</code> number tag.
 *
 * @param <T> the element type
 */
public interface TagInputNumber<T extends HNumberField> extends TagInputType<T> {

	@Override
	public default InputElement.InputType getInputType() {
		return InputElement.InputType.NUMBER;
	}

}
