package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagInputType;
import com.github.bordertech.webfriends.api.element.form.input.HUrlField;
import com.github.bordertech.webfriends.api.element.form.input.InputElement;

/**
 * HTML <code>input</code> URL tag.
 *
 * @param <T> the element type
 */
public interface TagInputUrl<T extends HUrlField> extends TagInputType<T> {

	@Override
	default InputElement.InputType getInputType() {
		return InputElement.InputType.URL;
	}

}
