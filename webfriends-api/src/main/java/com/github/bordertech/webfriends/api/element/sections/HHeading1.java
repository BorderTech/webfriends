package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * H1 element.
 */
public interface HHeading1 extends HeadingElement {

	@Override
	public default ElementTag<? extends HHeading1> getElementTag() {
		return StandardTags.H1;
	}

	@Override
	public default int getHeadingLevel() {
		return 1;
	}

}
