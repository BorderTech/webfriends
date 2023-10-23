package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.interactive.HDetails;

/**
 * HTML <code>details</code> tag.
 *
 * @param <T> the element type
 */
public interface TagDetails<T extends HDetails> extends TagType<T> {

	@Override
	default String getTagName() {
		return "details";
	}
}
