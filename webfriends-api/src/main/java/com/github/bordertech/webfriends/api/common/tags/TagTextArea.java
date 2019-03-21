package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.form.text.HTextArea;

/**
 * HTML <code>textarea</code> tag.
 *
 * @param <T> the element type
 */
public interface TagTextArea<T extends HTextArea> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "textarea";
	}

}
