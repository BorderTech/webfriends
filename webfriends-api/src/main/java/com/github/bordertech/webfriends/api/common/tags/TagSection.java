package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.sections.HSection;

/**
 * HTML <code>section</code> tag.
 *
 * @param <T> the element type
 */
public interface TagSection<T extends HSection> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "section";
	}
}
