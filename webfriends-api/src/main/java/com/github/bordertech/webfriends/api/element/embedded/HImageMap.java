package com.github.bordertech.webfriends.api.element.embedded;

import com.github.bordertech.webfriends.api.common.capability.Focusable;
import com.github.bordertech.webfriends.api.common.category.InteractiveContent;
import com.github.bordertech.webfriends.api.common.tags.TagImgMap;

/**
 * Image element associated with a map.
 * <p>
 * Content is Interactive and uses name attribute if the element has a usemap attribute.
 * </p>
 */
public interface HImageMap extends ImageElement, InteractiveContent, Focusable {

	@Override
	TagImgMap getTagType();
}
