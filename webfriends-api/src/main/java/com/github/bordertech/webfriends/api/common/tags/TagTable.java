package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.table.HTable;

/**
 * HTML <code>table</code> tag.
 *
 * @param <T> the element type
 */
public interface TagTable<T extends HTable> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "table";
	}

}
