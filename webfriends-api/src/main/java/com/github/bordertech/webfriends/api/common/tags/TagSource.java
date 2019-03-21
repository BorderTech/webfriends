package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.embedded.HSource;

/**
 * HTML <code>source</code> tag.
 *
 * @param <T> the element type
 */
public interface TagSource<T extends HSource> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "source";
	}

}
