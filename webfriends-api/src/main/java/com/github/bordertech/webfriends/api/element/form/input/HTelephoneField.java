package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.tags.TagInputTelephone;

/**
 * Telephone input element.
 */
public interface HTelephoneField extends InputTextSuggestionsElement {

	@Override
	TagInputTelephone getTagType();

	@Override
	default InputType getInputType() {
		return InputType.TELEPHONE;
	}

}
