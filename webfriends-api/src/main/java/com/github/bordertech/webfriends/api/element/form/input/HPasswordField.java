package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.tags.TagInputPassword;

/**
 * Password input element.
 */
public interface HPasswordField extends InputTextElement {

	@Override
	TagInputPassword getTagType();

	@Override
	default InputType getInputType() {
		return InputType.PASSWORD;
	}

}
