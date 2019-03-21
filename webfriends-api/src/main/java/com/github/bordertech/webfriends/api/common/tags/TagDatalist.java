package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.form.select.HDatalist;

/**
 * HTML <code>datalist</code> tag.
 *
 * @param <T> the element type
 */
public interface TagDatalist<T extends HDatalist> extends TagType<T> {

	@Override
	default String getTagName() {
		return "datalist";
	}

}
