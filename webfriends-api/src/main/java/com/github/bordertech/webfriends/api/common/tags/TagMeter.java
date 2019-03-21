package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.form.other.HMeter;

/**
 * HTML <code>meter</code> tag.
 *
 * @param <T> the element type
 */
public interface TagMeter<T extends HMeter> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "meter";
	}

}
