package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.document.HHtmlRoot;

/**
 * HTML <code>html</code> tag.
 *
 * @param <T> the element type
 */
public interface TagHtml<T extends HHtmlRoot> extends TagType<T> {

	@Override
	default String getTagName() {
		return "html";
	}

}
