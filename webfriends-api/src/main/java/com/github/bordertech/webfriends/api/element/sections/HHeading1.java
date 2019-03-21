package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.tags.TagH1;

/**
 * H1 element.
 */
public interface HHeading1 extends HeadingElement {

	@Override
	TagH1 getTagType();

	@Override
	default int getHeadingLevel() {
		return 1;
	}

}
