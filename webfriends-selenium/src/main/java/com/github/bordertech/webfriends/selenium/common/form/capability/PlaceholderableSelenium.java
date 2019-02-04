package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.Placeholderable;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Element that has a place holder.
 */
public interface PlaceholderableSelenium extends Placeholderable, SElement {

	@Override
	public default String getPlaceholder() {
		return getAttribute("placeholder");
	}

}
