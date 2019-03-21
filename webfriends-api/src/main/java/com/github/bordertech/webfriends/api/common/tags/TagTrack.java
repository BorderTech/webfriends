package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.embedded.HTrack;

/**
 * HTML <code>track</code> tag.
 *
 * @param <T> the element type
 */
public interface TagTrack<T extends HTrack> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "track";
	}

}
