package com.github.bordertech.webfriends.api.element.embedded;

import com.github.bordertech.webfriends.api.common.tags.TagImg;

/**
 * Image element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-img-element">HTML Spec</a>
 */
public interface HImage extends ImageElement {

	@Override
	TagImg getTagType();

}
