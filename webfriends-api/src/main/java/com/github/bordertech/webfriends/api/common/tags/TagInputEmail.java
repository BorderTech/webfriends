package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagInputType;
import com.github.bordertech.webfriends.api.element.form.input.HEmailField;
import com.github.bordertech.webfriends.api.element.form.input.InputElement;

/**
 * HTML <code>input</code> email tag.
 *
 * @param <T> the element type
 */
public interface TagInputEmail<T extends HEmailField> extends TagInputType<T> {

	@Override
	default InputElement.InputType getInputType() {
		return InputElement.InputType.EMAIL;
	}

}
