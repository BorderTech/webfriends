package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.combo.FlowPalpableWithPhrasingElement;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Paragraph element.
 */
public interface HParagraph extends FlowPalpableWithPhrasingElement {

	@Override
	public default ElementTag<? extends HParagraph> getElementTag() {
		return StandardTags.P;
	}

}
