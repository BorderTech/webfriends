package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * H2 element.
 */
public interface HHeading2 extends HeadingElement {

	@Override
	public default ElementTag<? extends HHeading2> getElementTag() {
		return StandardTags.H2;
	}

	@Override
	public default int getHeadingLevel() {
		return 2;
	}

}
