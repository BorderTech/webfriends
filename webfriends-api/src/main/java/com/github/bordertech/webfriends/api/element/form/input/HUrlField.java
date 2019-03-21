package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.tags.TagInputUrl;

/**
 * URL input element.
 */
public interface HUrlField extends InputTextSuggestionsElement {

	@Override
	TagInputUrl getTagType();

	@Override
	public default InputType getInputType() {
		return InputType.URL;
	}

}
