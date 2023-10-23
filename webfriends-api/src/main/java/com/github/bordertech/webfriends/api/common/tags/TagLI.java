package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.grouping.HListItem;

/**
 * HTML <code>li</code> list item tag.
 *
 * @param <T> the element type
 */
public interface TagLI<T extends HListItem> extends TagType<T> {

	@Override
	default String getTagName() {
		return "li";
	}

}
