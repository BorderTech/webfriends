package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagListContainerType;
import com.github.bordertech.webfriends.api.element.grouping.HMenu;

/**
 * HTML <code>menu</code> tag.
 *
 * @param <T> the element type
 */
public interface TagMenu<T extends HMenu> extends TagListContainerType<T> {

	@Override
	default String getTagName() {
		return "menu";
	}

}
