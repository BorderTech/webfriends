package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.form.HLabel;

/**
 * HTML <code>label</code> tag.
 *
 * @param <T> the element type
 */
public interface TagLabel<T extends HLabel> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "label";
	}

}
