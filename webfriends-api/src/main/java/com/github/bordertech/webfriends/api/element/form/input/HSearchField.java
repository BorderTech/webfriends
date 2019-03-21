package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.tags.TagInputSearch;

/**
 * Search input element.
 */
public interface HSearchField extends InputTextSuggestionsElement {

	@Override
	TagInputSearch getTagType();

	@Override
	default InputType getInputType() {
		return InputType.SEARCH;
	}

}
