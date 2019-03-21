package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.tags.TagMenuItem;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Menu item element.
 */
public interface HMenuItem extends ListItemElement {

	@Override
	TagMenuItem getTagType();

	/**
	 * @return the menu item text
	 */
	String getMenuItemText();

	@Override
	default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(HMenu.class);
	}
}
