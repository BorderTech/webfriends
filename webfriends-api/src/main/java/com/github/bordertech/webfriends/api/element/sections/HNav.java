package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.category.SectioningContent;
import com.github.bordertech.webfriends.api.common.combo.FlowPalpableElement;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Nav element.
 */
public interface HNav extends FlowPalpableElement, SectioningContent {

	@Override
	public default ElementTag<? extends HNav> getElementTag() {
		return StandardTags.NAV;
	}
}
