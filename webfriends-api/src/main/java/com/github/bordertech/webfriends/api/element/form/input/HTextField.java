package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Text input element.
 */
public interface HTextField extends InputTextSuggestionsElement {

	@Override
	public default ElementTag<? extends HTextField> getElementTag() {
		return StandardTags.INPUT_TEXT;
	}

	@Override
	public default InputType getInputType() {
		return InputType.TEXT;
	}

}
