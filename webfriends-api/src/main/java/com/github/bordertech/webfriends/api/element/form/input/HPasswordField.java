package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Password input element.
 */
public interface HPasswordField extends InputTextElement {

	@Override
	public default ElementTag<? extends HPasswordField> getElementTag() {
		return StandardTags.INPUT_PASSWORD;
	}

	@Override
	public default InputType getInputType() {
		return InputType.PASSWORD;
	}

}
