package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagInputType;
import com.github.bordertech.webfriends.api.element.form.input.HTextField;
import com.github.bordertech.webfriends.api.element.form.input.InputElement;

/**
 * HTML <code>input</code> text tag.
 *
 * @param <T> the element type
 */
public interface TagInputText<T extends HTextField> extends TagInputType<T> {

	@Override
	public default InputElement.InputType getInputType() {
		return InputElement.InputType.TEXT;
	}

}
