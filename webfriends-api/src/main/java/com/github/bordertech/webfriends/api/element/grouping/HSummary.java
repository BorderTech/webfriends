package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.combo.FlowPalpableElement;
import com.github.bordertech.webfriends.api.common.model.ScriptSupportingModel;
import com.github.bordertech.webfriends.api.common.tags.TagSummary;

/**
 * Summary element.
 */
public interface HSummary extends FlowPalpableElement, ScriptSupportingModel {

	@Override
	TagSummary getTagType();

}
