package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.tags.TagInputPassword;

/**
 * Password input element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/password">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#password-state-(type=password)">HTML Spec</a>
 */
public interface HPasswordField extends InputTextElement {

	@Override
	TagInputPassword getTagType();

	@Override
	default InputType getInputType() {
		return InputType.PASSWORD;
	}

}
