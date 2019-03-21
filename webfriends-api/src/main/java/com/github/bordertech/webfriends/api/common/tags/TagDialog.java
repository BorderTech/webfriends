package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.interactive.HDialog;

/**
 * HTML <code>dialog</code> tag.
 *
 * @param <T> the element type
 */
public interface TagDialog<T extends HDialog> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "dialog";
	}

}
