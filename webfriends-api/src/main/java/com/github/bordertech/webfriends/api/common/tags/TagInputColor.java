package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagInputType;
import com.github.bordertech.webfriends.api.element.form.input.HColorField;
import com.github.bordertech.webfriends.api.element.form.input.InputElement;

/**
 * HTML <code>input</code> color tag.
 *
 * @param <T> the element type
 */
public interface TagInputColor<T extends HColorField> extends TagInputType<T> {

	@Override
	default InputElement.InputType getInputType() {
		return InputElement.InputType.COLOR;
	}

}
