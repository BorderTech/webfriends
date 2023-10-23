package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.control.FormDateControl;
import com.github.bordertech.webfriends.api.common.tags.TagInputDate;

/**
 * Date input element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/date">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#date-state-(type=date)">HTML Spec</a>
 */
public interface HDateField extends InputElement, FormDateControl {

	@Override
	TagInputDate getTagType();

	@Override
	default InputType getInputType() {
		return InputType.DATE;
	}

}
