package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagListContainerType;
import com.github.bordertech.webfriends.api.element.grouping.HOrderedList;

/**
 * HTML <code>ol</code> ordered list tag.
 *
 * @param <T> the element type
 */
public interface TagOrderedList<T extends HOrderedList> extends TagListContainerType<T> {

	@Override
	default String getTagName() {
		return "ol";
	}

}
