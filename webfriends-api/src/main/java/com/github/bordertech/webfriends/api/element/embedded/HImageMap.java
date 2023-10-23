package com.github.bordertech.webfriends.api.element.embedded;

import com.github.bordertech.webfriends.api.common.capability.Focusable;
import com.github.bordertech.webfriends.api.common.category.InteractiveContent;
import com.github.bordertech.webfriends.api.common.tags.TagImgMap;

/**
 * Image element associated with a map.
 * <p>
 * Content is Interactive and uses name attribute if the element has a usemap attribute.
 * </p>
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img#usemap">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#image-maps">HTML Spec</a>
 */
public interface HImageMap extends ImageElement, InteractiveContent, Focusable {

	@Override
	TagImgMap getTagType();
}
