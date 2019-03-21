package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagListContainerType;
import com.github.bordertech.webfriends.api.element.grouping.HUnorderedList;

/**
 * HTML <code>ul</code> tag.
 *
 * @param <T> the element type
 */
public interface TagUnorderedList<T extends HUnorderedList> extends TagListContainerType<T> {

	@Override
	default String getTagName() {
		return "ul";
	}

}
