package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * H3 element.
 */
public interface HHeading3 extends HeadingElement {

	@Override
	public default ElementTag<? extends HHeading3> getElementTag() {
		return StandardTags.H3;
	}

	@Override
	public default int getHeadingLevel() {
		return 3;
	}

}
