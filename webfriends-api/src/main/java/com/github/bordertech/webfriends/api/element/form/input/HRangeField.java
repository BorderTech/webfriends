package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.capability.Autocompleteable;
import com.github.bordertech.webfriends.api.common.form.capability.MinMaxConstrainableNumber;
import com.github.bordertech.webfriends.api.common.form.capability.Stepable;
import com.github.bordertech.webfriends.api.common.form.capability.Suggestable;
import com.github.bordertech.webfriends.api.common.form.capability.ValueNumber;
import com.github.bordertech.webfriends.api.common.tags.TagInputRange;

/**
 * Input range element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/range">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#range-state-(type=range)">HTML Spec</a>
 */
public interface HRangeField extends InputElement,
		Autocompleteable, Suggestable, MinMaxConstrainableNumber, Stepable, ValueNumber {

	@Override
	TagInputRange getTagType();

	@Override
	default InputType getInputType() {
		return InputType.RANGE;
	}
}
