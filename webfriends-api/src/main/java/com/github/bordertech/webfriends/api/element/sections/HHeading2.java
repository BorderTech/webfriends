package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.tags.TagH2;

/**
 * H2 element.
 */
public interface HHeading2 extends HeadingElement {

	@Override
	TagH2 getTagType();

	@Override
	default int getHeadingLevel() {
		return 2;
	}

}
