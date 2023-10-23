package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.tags.TagH4;

/**
 * H4 element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements">HTML Spec</a>
 */
public interface HHeading4 extends HeadingElement {

	@Override
	TagH4 getTagType();

	@Override
	default int getHeadingLevel() {
		return 4;
	}

}
