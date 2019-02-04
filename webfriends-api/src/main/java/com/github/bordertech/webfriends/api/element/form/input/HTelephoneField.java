package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Telephone input element.
 */
public interface HTelephoneField extends InputTextSuggestionsElement {

	@Override
	public default ElementTag<? extends HTelephoneField> getElementTag() {
		return StandardTags.INPUT_TELEPHONE;
	}

	@Override
	public default InputType getInputType() {
		return InputType.TELEPHONE;
	}

}
