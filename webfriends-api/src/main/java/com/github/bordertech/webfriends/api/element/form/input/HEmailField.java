package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.capability.ValueMulti;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Email input element.
 */
public interface HEmailField extends InputTextSuggestionsElement, ValueMulti {

	@Override
	public default ElementTag<? extends HEmailField> getElementTag() {
		return StandardTags.INPUT_EMAIL;
	}

	@Override
	public default InputType getInputType() {
		return InputType.EMAIL;
	}

}
