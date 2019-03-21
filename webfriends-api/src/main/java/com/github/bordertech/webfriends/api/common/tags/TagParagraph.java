package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.grouping.HParagraph;

/**
 * HTML <code>p</code> tag.
 *
 * @param <T> the element type
 */
public interface TagParagraph<T extends HParagraph> extends TagType<T> {

	@Override
	default String getTagName() {
		return "p";
	}

}
