package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.category.ScriptSupporting;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Menu element.
 *
 * @param <T> the menu item type
 */
public interface HMenu<T extends HMenuItem> extends ListElement<T> {

	@Override
	public default ElementTag<? extends HMenu> getElementTag() {
		return StandardTags.MENU;
	}

	/**
	 * @param text the text of the menu item
	 * @return the menu item, or null
	 */
	HMenuItem getMenuItemByText(final String text);

	@Override
	public default List<Class<? extends Element>> getChildrenAllowed() {
		return Arrays.asList(ScriptSupporting.class, HMenuItem.class);
	}
}
