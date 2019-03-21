package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.category.SectioningContent;
import com.github.bordertech.webfriends.api.common.combo.FlowPalpableElement;
import com.github.bordertech.webfriends.api.common.tags.TagSection;

/**
 * A section element represents a generic section of the document.
 */
public interface HSection extends FlowPalpableElement, SectioningContent {

	@Override
	TagSection getTagType();
}
