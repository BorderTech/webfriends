package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.category.SectioningContent;
import com.github.bordertech.webfriends.api.common.combo.FlowPalpableElement;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * A section element represents a generic section of the document.
 */
public interface HSection extends FlowPalpableElement, SectioningContent {

	@Override
	public default ElementTag<? extends HSection> getElementTag() {
		return StandardTags.SECTION;
	}
}
