package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.capability.ValueMulti;
import com.github.bordertech.webfriends.api.common.tags.TagInputEmail;

/**
 * Email input element.
 */
public interface HEmailField extends InputTextSuggestionsElement, ValueMulti {

	@Override
	TagInputEmail getTagType();

	@Override
	public default InputType getInputType() {
		return InputType.EMAIL;
	}

}
