package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.tags.TagOrderedListItem;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Ordered list item element.
 */
public interface HOrderedListItem extends ListItemElement {

	@Override
	TagOrderedListItem getTagType();

	/**
	 * @return ordinal value of the item.
	 */
	int getOrdinalValue();

	@Override
	public default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(HOrderedList.class);
	}
}
