package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.sections.HBody;

/**
 * HTML <code>body</code> tag.
 *
 * @param <T> the element type
 */
public interface TagBody<T extends HBody> extends TagType<T> {

	@Override
	default String getTagName() {
		return "body";
	}

}
