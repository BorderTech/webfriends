package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.HeadingContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.model.PhrasingModel;
import com.github.bordertech.webfriends.api.common.tag.TagHeadingType;

/**
 * Heading element.
 */
public interface HeadingElement extends FlowContent, PalpableContent, HeadingContent, FlowContext, PhrasingModel {

	@Override
	TagHeadingType getTagType();

	/**
	 * @return the heading level
	 */
	int getHeadingLevel();

}
