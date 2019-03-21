package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.grouping.HFigure;

/**
 * HTML <code>figure</code> tag.
 *
 * @param <T> the element type
 */
public interface TagFigure<T extends HFigure> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "figure";
	}
}
