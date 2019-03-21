package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagInputType;
import com.github.bordertech.webfriends.api.element.form.input.HTelephoneField;
import com.github.bordertech.webfriends.api.element.form.input.InputElement;

/**
 * HTML <code>input</code> telephone tag.
 *
 * @param <T> the element type
 */
public interface TagInputTelephone<T extends HTelephoneField> extends TagInputType<T> {

	@Override
	public default InputElement.InputType getInputType() {
		return InputElement.InputType.TELEPHONE;
	}

}
