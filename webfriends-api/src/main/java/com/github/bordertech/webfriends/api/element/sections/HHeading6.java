package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * H6 element.
 */
public interface HHeading6 extends HeadingElement {

	@Override
	public default ElementTag<? extends HHeading6> getElementTag() {
		return StandardTags.H6;
	}

	@Override
	public default int getHeadingLevel() {
		return 6;
	}

}
