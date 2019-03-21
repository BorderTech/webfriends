package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagMediaType;
import com.github.bordertech.webfriends.api.element.embedded.HVideo;

/**
 * HTML <code>video</code> tag.
 *
 * @param <T> the element type
 */
public interface TagVideo<T extends HVideo> extends TagMediaType<T> {

	@Override
	public default String getTagName() {
		return "video";
	}
}
