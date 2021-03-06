package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagListItemType;
import com.github.bordertech.webfriends.api.element.grouping.HOrderedListItem;

/**
 * HTML <code>li</code> list item tag.
 *
 * @param <T> the element type
 */
public interface TagOrderedListItem<T extends HOrderedListItem> extends TagListItemType<T> {

	@Override
	default String getTagName() {
		// TODO Need to fix the qualifier for menu item to differentiate from listitem
		return "li";
	}

}
