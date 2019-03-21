package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.tags.TagH5;

/**
 * H5 element.
 */
public interface HHeading5 extends HeadingElement {

	@Override
	TagH5 getTagType();

	@Override
	public default int getHeadingLevel() {
		return 5;
	}

}
