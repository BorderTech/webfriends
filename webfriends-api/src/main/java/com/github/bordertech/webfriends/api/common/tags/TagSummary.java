package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.grouping.HSummary;

/**
 * HTML <code>summary</code> tag.
 *
 * @param <T> the element type
 */
public interface TagSummary<T extends HSummary> extends TagType<T> {

	@Override
	default String getTagName() {
		return "summary";
	}
}
