package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.model.ScriptSupportingModel;
import com.github.bordertech.webfriends.api.common.tags.TagDiv;

/**
 * Div element.
 */
public interface HDiv extends FlowContent, PalpableContent,
		FlowContext,
		FlowModel, ScriptSupportingModel {
	// TODO Special logic for div after dl,dt,dd element

	@Override
	TagDiv getTagType();

}
