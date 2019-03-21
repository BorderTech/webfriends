package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.sections.HFooter;

/**
 * HTML <code>footer</code> tag.
 *
 * @param <T> the element type
 */
public interface TagFooter<T extends HFooter> extends TagType<T> {

	@Override
	public default String getTagName() {
		return "footer";
	}

}
