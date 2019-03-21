package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.Sizeable;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Element that can be sized.
 */
public interface SizeableSelenium extends Sizeable, SElement {

	@Override
	default Integer getSize() {
		return getAttributeAsInteger("size");
	}

}
