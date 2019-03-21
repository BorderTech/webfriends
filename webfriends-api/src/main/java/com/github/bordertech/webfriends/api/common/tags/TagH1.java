package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagHeadingType;
import com.github.bordertech.webfriends.api.element.sections.HHeading1;

/**
 * HTML <code>h1</code> tag.
 *
 * @param <T> the element type
 *
 */
public interface TagH1<T extends HHeading1> extends TagHeadingType<T> {

	@Override
	public default String getTagName() {
		return "h1";
	}

}
