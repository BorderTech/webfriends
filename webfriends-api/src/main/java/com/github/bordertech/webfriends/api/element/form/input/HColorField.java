package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.capability.Autocompleteable;
import com.github.bordertech.webfriends.api.common.form.capability.Suggestable;
import com.github.bordertech.webfriends.api.common.form.capability.ValueColor;
import com.github.bordertech.webfriends.api.common.tags.TagInputColor;

/**
 * Input color element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/color">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#color-state-(type=color)">HTML Spec</a>
 */
public interface HColorField extends InputElement, Autocompleteable, Suggestable, ValueColor {

	@Override
	TagInputColor getTagType();

	@Override
	default InputType getInputType() {
		return InputType.COLOR;
	}
}
