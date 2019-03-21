package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.form.HButton;

/**
 * HTML <code>button</code> tag.
 *
 * @param <T> the element type
 */
public interface TagButton<T extends HButton> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "button";
	}

}
