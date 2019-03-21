package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagHeadingType;
import com.github.bordertech.webfriends.api.element.sections.HHeading2;

/**
 * HTML <code>h2</code> tag.
 *
 * @param <T> the element type
 *
 */
public interface TagH2<T extends HHeading2> extends TagHeadingType<T> {

	@Override
	default String getTagName() {
		return "h2";
	}

}
