package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.table.HCaption;

/**
 * HTML <code>caption</code> tag.
 *
 * @param <T> the element type
 *
 */
public interface TagCaption<T extends HCaption> extends TagType<T> {

	@Override
	default String getTagName() {
		return "caption";
	}

}
