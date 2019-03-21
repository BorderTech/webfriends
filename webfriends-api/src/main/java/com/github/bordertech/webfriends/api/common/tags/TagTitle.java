package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;

/**
 * HTML <code>title</code> tag.
 */
public interface TagTitle extends TagType {

	@Override
	default String getTagName() {
		return "title";
	}

}
