package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.form.select.HSelect;

/**
 * HTML <code>select</code> tag.
 *
 * @param <T> the element type
 */
public interface TagSelect<T extends HSelect> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "select";
	}

}
