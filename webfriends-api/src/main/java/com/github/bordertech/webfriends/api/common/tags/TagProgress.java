package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.form.other.HProgress;

/**
 * HTML <code>progress</code> tag.
 *
 * @param <T> the element type
 */
public interface TagProgress<T extends HProgress> extends TagType<T> {

	@Override
	default String getTagName() {
		return "progress";
	}

}
