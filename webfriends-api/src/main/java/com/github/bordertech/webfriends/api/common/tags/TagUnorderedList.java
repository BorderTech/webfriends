package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.element.grouping.HUnorderedList;
import com.github.bordertech.webfriends.api.common.tag.TagListContainerType;

/**
 * HTML <code>ul</code> tag.
 *
 * @param <T> the element type
 */
public interface TagUnorderedList<T extends HUnorderedList> extends TagListContainerType<T> {

	@Override
	public default String getTagName() {
		return "ul";
	}

}
