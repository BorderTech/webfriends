package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.tags.TagInputText;

/**
 * Text input element.
 */
public interface HTextField extends InputTextSuggestionsElement {

	@Override
	TagInputText getTagType();

	@Override
	default InputType getInputType() {
		return InputType.TEXT;
	}

}
