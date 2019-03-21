package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.sections.HNav;

/**
 * HTML <code>nav</code> tag.
 *
 * @param <T> the element type
 */
public interface TagNav<T extends HNav> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "nav";
	}

}
