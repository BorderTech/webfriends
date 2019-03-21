package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.element.grouping.HOrderedList;
import com.github.bordertech.webfriends.api.common.tag.TagListContainerType;

/**
 * HTML <code>ol</code> ordered list tag.
 *
 * @param <T> the element type
 */
public interface TagOrderedList<T extends HOrderedList> extends TagListContainerType<T> {

	@Override
	public default String getTagName() {
		return "ol";
	}

}
