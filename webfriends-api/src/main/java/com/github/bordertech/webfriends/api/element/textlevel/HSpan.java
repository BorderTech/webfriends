package com.github.bordertech.webfriends.api.element.textlevel;

import com.github.bordertech.webfriends.api.common.combo.PhrasingPalpableElement;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Span element.
 */
public interface HSpan extends PhrasingPalpableElement {

	@Override
	public default ElementTag<? extends HSpan> getElementTag() {
		return StandardTags.SPAN;
	}
}
