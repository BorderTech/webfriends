package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.category.HeadingContent;
import com.github.bordertech.webfriends.api.common.combo.FlowPalpableWithPhrasingElement;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;

/**
 * Heading element.
 */
public interface HeadingElement extends FlowPalpableWithPhrasingElement, HeadingContent {

	@Override
	public ElementTag<? extends HeadingElement> getElementTag();

	/**
	 * @return the heading level
	 */
	int getHeadingLevel();

}
