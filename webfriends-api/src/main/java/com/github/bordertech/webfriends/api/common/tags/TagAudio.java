package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagMediaType;
import com.github.bordertech.webfriends.api.element.embedded.HAudio;

/**
 * HTML <code>audio</code> tag.
 *
 * @param <T> the element type
 */
public interface TagAudio<T extends HAudio> extends TagMediaType<T> {

	@Override
	public default String getTagName() {
		return "audio";
	}

}
