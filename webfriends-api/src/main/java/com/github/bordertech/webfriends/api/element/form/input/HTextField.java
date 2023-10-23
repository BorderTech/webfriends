package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.tags.TagInputText;

/**
 * Text input element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/text">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#text-(type=text)-state-and-search-state-(type=search)">HTML Spec</a>
 */
public interface HTextField extends InputTextSuggestionsElement {

	@Override
	TagInputText getTagType();

	@Override
	default InputType getInputType() {
		return InputType.TEXT;
	}

}
