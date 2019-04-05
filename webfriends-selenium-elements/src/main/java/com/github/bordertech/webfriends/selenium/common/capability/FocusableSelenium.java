package com.github.bordertech.webfriends.selenium.common.capability;

import com.github.bordertech.webfriends.api.common.capability.Focusable;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Element that can be focused.
 */
public interface FocusableSelenium extends Focusable, SElement {

	@Override
	default TabIndexType getTabIndex() {
		return TabIndexType.findType(getTabIndexValue());
	}

	@Override
	default Integer getTabIndexValue() {
		return getAttributeAsInteger(TabIndexType.ATTR);
	}

	@Override
	default String getAccessKey() {
		return getAttribute("accesskey");
	}

}
