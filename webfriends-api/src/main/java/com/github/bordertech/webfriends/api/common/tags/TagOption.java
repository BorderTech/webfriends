package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.form.select.HOption;

/**
 * HTML <code>option</code> ordered list tag.
 *
 * @param <T> the element type
 */
public interface TagOption<T extends HOption> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "option";
	}

}
