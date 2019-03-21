package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.grouping.HDiv;

/**
 * HTML <code>div</code> tag.
 *
 * @param <T> the element type
 */
public interface TagDiv<T extends HDiv> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "div";
	}
}
