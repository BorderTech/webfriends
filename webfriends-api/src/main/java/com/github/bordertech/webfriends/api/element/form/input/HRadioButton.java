package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.capability.Checkable;
import com.github.bordertech.webfriends.api.common.form.capability.Requireable;
import com.github.bordertech.webfriends.api.common.tags.TagInputRadio;
import com.github.bordertech.webfriends.api.element.form.other.RadioButtonGroup;

/**
 * Radio button input element.
 */
public interface HRadioButton extends InputElement, Checkable, Requireable {

	@Override
	TagInputRadio getTagType();

	@Override
	public default InputType getInputType() {
		return InputType.RADIO;
	}

	/**
	 * @return the radio button group
	 */
	RadioButtonGroup getRadioButtonGroup();

}
