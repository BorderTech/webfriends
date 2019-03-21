package com.github.bordertech.webfriends.api.common.tag;

import com.github.bordertech.webfriends.api.element.embedded.ImageElement;

/**
 * HTML image tag type.
 *
 * @param <T> the image element type
 */
public interface TagImageType<T extends ImageElement> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "img";
	}
}
