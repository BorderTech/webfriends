package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * URL input element.
 */
public interface HUrlField extends InputTextSuggestionsElement {

	@Override
	public default ElementTag<? extends HUrlField> getElementTag() {
		return StandardTags.INPUT_URL;
	}

	@Override
	public default InputType getInputType() {
		return InputType.URL;
	}

}
