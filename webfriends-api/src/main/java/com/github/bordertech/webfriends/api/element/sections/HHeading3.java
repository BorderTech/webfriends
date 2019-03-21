package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.tags.TagH3;

/**
 * H3 element.
 */
public interface HHeading3 extends HeadingElement {

	@Override
	TagH3 getTagType();

	@Override
	default int getHeadingLevel() {
		return 3;
	}

}
