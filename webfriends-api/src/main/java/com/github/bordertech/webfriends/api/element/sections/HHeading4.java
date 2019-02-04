package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * H4 element.
 */
public interface HHeading4 extends HeadingElement {

	@Override
	public default ElementTag<? extends HHeading4> getElementTag() {
		return StandardTags.H4;
	}

	@Override
	public default int getHeadingLevel() {
		return 4;
	}

}
