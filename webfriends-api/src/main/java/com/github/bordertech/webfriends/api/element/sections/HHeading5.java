package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * H5 element.
 */
public interface HHeading5 extends HeadingElement {

	@Override
	public default ElementTag<? extends HHeading5> getElementTag() {
		return StandardTags.H5;
	}

	@Override
	public default int getHeadingLevel() {
		return 5;
	}

}
