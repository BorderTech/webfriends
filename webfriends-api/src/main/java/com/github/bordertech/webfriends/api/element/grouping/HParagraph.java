package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.combo.FlowPalpableWithPhrasingElement;
import com.github.bordertech.webfriends.api.common.tags.TagParagraph;

/**
 * Paragraph element.
 */
public interface HParagraph extends FlowPalpableWithPhrasingElement {

	@Override
	TagParagraph getTagType();

}
