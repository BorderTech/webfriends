package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.textlevel.HLinkAnchor;

/**
 * HTML <code>a</code> tag.
 *
 * @param <T> the element type
 */
public interface TagA<T extends HLinkAnchor> extends TagType<T> {

	@Override
	default String getTagName() {
		return "a";
	}

}
