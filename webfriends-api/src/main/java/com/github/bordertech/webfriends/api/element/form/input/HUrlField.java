package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.tags.TagInputUrl;

/**
 * URL input element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/url">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#url-state-(type=url)">HTML Spec</a>
 */
public interface HUrlField extends InputTextSuggestionsElement {

	@Override
	TagInputUrl getTagType();

	@Override
	default InputType getInputType() {
		return InputType.URL;
	}

}
