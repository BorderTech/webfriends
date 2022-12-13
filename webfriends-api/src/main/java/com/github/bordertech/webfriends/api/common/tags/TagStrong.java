package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.grouping.HStrong;

/**
 * HTML <code>strong</code> tag.
 *
 * @param <T> the element type
 */
public interface TagStrong<T extends HStrong> extends TagType<T> {

	@Override
	default String getTagName() {
		return "strong";
	}

}
