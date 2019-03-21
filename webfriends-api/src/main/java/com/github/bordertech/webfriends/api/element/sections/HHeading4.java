package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.tags.TagH4;

/**
 * H4 element.
 */
public interface HHeading4 extends HeadingElement {

	@Override
	TagH4 getTagType();

	@Override
	default int getHeadingLevel() {
		return 4;
	}

}
