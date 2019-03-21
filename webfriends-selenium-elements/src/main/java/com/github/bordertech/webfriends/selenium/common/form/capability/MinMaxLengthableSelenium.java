package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.MinMaxLengthable;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Element that has min and max lengths.
 */
public interface MinMaxLengthableSelenium extends MinMaxLengthable, SElement {

	@Override
	default Integer getMinLength() {
		return getAttributeAsInteger("minlength");
	}

	@Override
	default Integer getMaxLength() {
		return getAttributeAsInteger("maxlength");
	}

}
