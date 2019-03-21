package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.sections.HHeader;

/**
 * HTML <code>header</code> tag.
 *
 * @param <T> the element type
 */
public interface TagHeader<T extends HHeader> extends TagType<T> {

	@Override
	default String getTagName() {
		return "header";
	}

}
