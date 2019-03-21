package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.table.HDataCell;

/**
 * HTML <code>td</code> data cell tag.
 *
 * @param <T> the element type
 */
public interface TagTD<T extends HDataCell> extends TagType<T> {

	@Override
	default String getTagName() {
		return "td";
	}

}
