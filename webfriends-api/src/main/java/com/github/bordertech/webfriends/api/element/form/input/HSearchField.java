package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Search input element.
 */
public interface HSearchField extends InputTextSuggestionsElement {

	@Override
	public default ElementTag<? extends HSearchField> getElementTag() {
		return StandardTags.INPUT_SEARCH;
	}

	@Override
	public default InputType getInputType() {
		return InputType.SEARCH;
	}

}
