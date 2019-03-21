package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.metadata.HHead;

/**
 * HTML <code>head</code> tag.
 *
 * @param <T> the element type
 */
public interface TagHead<T extends HHead> extends TagType<T> {

	@Override
	default String getTagName() {
		return "head";
	}

}
