package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.capability.ValueMulti;
import com.github.bordertech.webfriends.api.common.tags.TagInputEmail;

/**
 * Email input element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/email">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#email-state-(type=email)">HTML Spec</a>
 */
public interface HEmailField extends InputTextSuggestionsElement, ValueMulti {

	@Override
	TagInputEmail getTagType();

	@Override
	default InputType getInputType() {
		return InputType.EMAIL;
	}

}
