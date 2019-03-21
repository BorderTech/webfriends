package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagHeadingType;
import com.github.bordertech.webfriends.api.element.sections.HHeading5;

/**
 * HTML <code>h5</code> tag.
 *
 * @param <T> the element type
 */
public interface TagH5<T extends HHeading5> extends TagHeadingType<T> {

	@Override
	public default String getTagName() {
		return "h5";
	}

}
