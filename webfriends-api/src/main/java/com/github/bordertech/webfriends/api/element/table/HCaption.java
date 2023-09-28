package com.github.bordertech.webfriends.api.element.table;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.model.PhrasingModel;
import com.github.bordertech.webfriends.api.common.tags.TagCaption;

/**
 * Caption element.
 */
public interface HCaption extends FlowContent, PalpableContent, FlowContext, PhrasingModel {

	@Override
	TagCaption getTagType();

}
