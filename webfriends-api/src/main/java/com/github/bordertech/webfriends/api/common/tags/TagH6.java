package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagHeadingType;
import com.github.bordertech.webfriends.api.element.sections.HHeading6;

/**
 * HTML <code>h6</code> tag.
 *
 * @param <T> the element type
 */
public interface TagH6<T extends HHeading6> extends TagHeadingType<T> {

	@Override
	default String getTagName() {
		return "h6";
	}

}
