package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagInputType;
import com.github.bordertech.webfriends.api.element.form.input.HSearchField;
import com.github.bordertech.webfriends.api.element.form.input.InputElement;

/**
 * HTML <code>input</code> search tag.
 *
 * @param <T> the element type
 */
public interface TagInputSearch<T extends HSearchField> extends TagInputType<T> {

	@Override
	default InputElement.InputType getInputType() {
		return InputElement.InputType.SEARCH;
	}

}
