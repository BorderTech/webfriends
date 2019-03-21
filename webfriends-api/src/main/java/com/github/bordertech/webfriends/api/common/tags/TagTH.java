package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.table.HHeaderCell;

/**
 * HTML <code>th</code> header cell tag.
 *
 * @param <T> the element type
 */
public interface TagTH<T extends HHeaderCell> extends TagType<T> {

	@Override
	default String getTagName() {
		return "th";
	}

}
