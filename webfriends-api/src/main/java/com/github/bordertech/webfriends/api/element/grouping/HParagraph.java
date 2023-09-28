package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.model.PhrasingModel;
import com.github.bordertech.webfriends.api.common.tags.TagParagraph;

/**
 * Paragraph element.
 */
public interface HParagraph extends FlowContent, PalpableContent,
		FlowContext,
		PhrasingModel {

	@Override
	TagParagraph getTagType();

}
