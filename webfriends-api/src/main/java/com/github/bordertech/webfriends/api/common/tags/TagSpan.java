package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.textlevel.HSpan;

/**
 * HTML <code>span</code> tag.
 *
 * @param <T> the element type
 */
public interface TagSpan<T extends HSpan> extends TagType<T> {

	@Override
	default String getTagName() {
		return "span";
	}
}
