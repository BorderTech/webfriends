package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.capability.Checkable;
import com.github.bordertech.webfriends.api.common.form.capability.Requireable;
import com.github.bordertech.webfriends.api.common.tags.TagInputRadio;
import com.github.bordertech.webfriends.api.element.form.other.RadioButtonGroup;

/**
 * Radio button input element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/radio">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#radio-button-state-(type=radio)">HTML Spec</a>
 */
public interface HRadioButton extends InputElement, Checkable, Requireable {

	@Override
	TagInputRadio getTagType();

	@Override
	default InputType getInputType() {
		return InputType.RADIO;
	}

	/**
	 * @return the radio button group
	 */
	RadioButtonGroup getRadioButtonGroup();

}
