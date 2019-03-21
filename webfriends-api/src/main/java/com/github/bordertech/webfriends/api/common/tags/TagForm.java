package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.form.HForm;

/**
 * HTML <code>form</code> tag.
 *
 * @param <T> the element type
 *
 */
public interface TagForm<T extends HForm> extends TagType<T> {

	@Override
	default String getTagName() {
		return "form";
	}

}
