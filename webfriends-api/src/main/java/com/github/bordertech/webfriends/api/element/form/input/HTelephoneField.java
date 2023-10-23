package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.tags.TagInputTelephone;

/**
 * Telephone input element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/tel">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#telephone-state-(type=tel)">HTML Spec</a>
 */
public interface HTelephoneField extends InputTextSuggestionsElement {

	@Override
	TagInputTelephone getTagType();

	@Override
	default InputType getInputType() {
		return InputType.TELEPHONE;
	}

}
