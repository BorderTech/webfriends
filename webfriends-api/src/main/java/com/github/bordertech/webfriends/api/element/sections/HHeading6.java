package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.tags.TagH6;

/**
 * H6 element.
 */
public interface HHeading6 extends HeadingElement {

	@Override
	TagH6 getTagType();

	@Override
	default int getHeadingLevel() {
		return 6;
	}

}
