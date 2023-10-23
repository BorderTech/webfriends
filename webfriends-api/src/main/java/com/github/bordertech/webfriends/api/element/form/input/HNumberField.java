package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.control.FormNumberControl;
import com.github.bordertech.webfriends.api.common.tags.TagInputNumber;

/**
 * Input number element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/number">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#number-state-(type=number)">HTML Spec</a>
 */
public interface HNumberField extends InputElement, FormNumberControl {

	@Override
	TagInputNumber getTagType();

	@Override
	default InputType getInputType() {
		return InputType.NUMBER;
	}
}
