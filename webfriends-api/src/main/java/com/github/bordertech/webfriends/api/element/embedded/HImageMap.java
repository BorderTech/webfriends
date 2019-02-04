package com.github.bordertech.webfriends.api.element.embedded;

import com.github.bordertech.webfriends.api.common.capability.Focusable;
import com.github.bordertech.webfriends.api.common.category.InteractiveContent;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Image element associated with a map.
 * <p>
 * Content is Interactive and uses name attribute if the element has a usemap attribute.
 * </p>
 */
public interface HImageMap extends HImage, InteractiveContent, Focusable {

	@Override
	public default ElementTag<? extends HImageMap> getElementTag() {
		return StandardTags.IMG_MAP;
	}
}
