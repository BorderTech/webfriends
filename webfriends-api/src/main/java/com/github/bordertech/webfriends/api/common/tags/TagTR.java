package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.table.HRow;

/**
 * HTML <code>tr</code> tag.
 *
 * @param <T> the element type
 */
public interface TagTR<T extends HRow> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "tr";
	}
}
