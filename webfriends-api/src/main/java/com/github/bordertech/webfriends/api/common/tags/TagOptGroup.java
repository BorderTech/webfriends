package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.form.select.HOptGroup;

/**
 * HTML <code>optgroup</code> tag.
 *
 * @param <T> the element type
 */
public interface TagOptGroup<T extends HOptGroup> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "optgroup";
	}

}
