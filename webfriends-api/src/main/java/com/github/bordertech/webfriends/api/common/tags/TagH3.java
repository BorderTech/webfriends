package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagHeadingType;
import com.github.bordertech.webfriends.api.element.sections.HHeading3;

/**
 * HTML <code>h3</code> tag.
 *
 * @param <T> the element type
 *
 */
public interface TagH3<T extends HHeading3> extends TagHeadingType<T> {

	@Override
	default String getTagName() {
		return "h3";
	}

}
