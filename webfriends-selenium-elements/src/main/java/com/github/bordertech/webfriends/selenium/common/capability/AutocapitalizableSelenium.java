package com.github.bordertech.webfriends.selenium.common.capability;

import com.github.bordertech.webfriends.api.common.capability.Autocapitalizable;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Element that can be autocapitalized.
 */
public interface AutocapitalizableSelenium extends Autocapitalizable, SElement {

	@Override
	public default AutocapitalizeType getAutocapitalize() {
		AutocapitalizeType type = getAttributeToken(AutocapitalizeType.ATTR, AutocapitalizeType.values());
		// TODO Check this logic is correct
		return type == null ? AutocapitalizeType.DEFAULT : type;
	}
}
