package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagInputType;
import com.github.bordertech.webfriends.api.element.form.input.HDateField;
import com.github.bordertech.webfriends.api.element.form.input.InputElement;

/**
 * HTML <code>input</code> date tag.
 *
 * @param <T> the element type
 */
public interface TagInputDate<T extends HDateField> extends TagInputType<T> {

	@Override
	public default InputElement.InputType getInputType() {
		return InputElement.InputType.DATE;
	}

}
