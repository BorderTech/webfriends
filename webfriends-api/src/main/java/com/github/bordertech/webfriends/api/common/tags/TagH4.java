package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagHeadingType;
import com.github.bordertech.webfriends.api.element.sections.HHeading4;

/**
 * HTML <code>h4</code> tag.
 *
 * @param <T> the element type
 */
public interface TagH4<T extends HHeading4> extends TagHeadingType<T> {

	@Override
	public default String getTagName() {
		return "h4";
	}

}
