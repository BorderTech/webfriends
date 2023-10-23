package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.capability.Checkable;
import com.github.bordertech.webfriends.api.common.form.capability.Requireable;
import com.github.bordertech.webfriends.api.common.tags.TagInputCheckbox;

/**
 * CheckBox input element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#checkbox-state-(type=checkbox)">HTML Spec</a>
 */
public interface HCheckBox extends InputElement, Checkable, Requireable {

	@Override
	TagInputCheckbox getTagType();

	@Override
	default InputType getInputType() {
		return InputType.CHECKBOX;
	}

}
