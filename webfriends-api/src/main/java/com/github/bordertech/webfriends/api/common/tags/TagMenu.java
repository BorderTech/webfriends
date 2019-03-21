package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.element.grouping.HMenu;
import com.github.bordertech.webfriends.api.common.tag.TagListContainerType;

/**
 * HTML <code>menu</code> tag.
 *
 * @param <T> the element type
 */
public interface TagMenu<T extends HMenu> extends TagListContainerType<T> {

	@Override
	public default String getTagName() {
		return "menu";
	}

}
