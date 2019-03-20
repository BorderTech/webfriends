package com.github.bordertech.webfriends.selenium.common.capability;

import com.github.bordertech.webfriends.api.common.capability.Focusable;
import com.github.bordertech.webfriends.selenium.common.feature.Clickable;
import com.github.bordertech.webfriends.selenium.common.feature.Keyboardable;

/**
 * Element that can be focused.
 */
public interface FocusableSelenium extends Focusable, Clickable, Keyboardable {

	@Override
	public default String getAccessKey() {
		return getAttribute("accesskey");
	}

	@Override
	public default TabIndexType getTabIndex() {
		return TabIndexType.findType(getTabIndexValue());
	}

	@Override
	public default Integer getTabIndexValue() {
		return getAttributeAsInteger(TabIndexType.ATTR);
	}

}
