package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.combo.FlowPalpableElement;
import com.github.bordertech.webfriends.api.common.model.ScriptSupportingModel;
import com.github.bordertech.webfriends.api.common.tags.TagDiv;

/**
 * Div element.
 */
public interface HDiv extends FlowPalpableElement, ScriptSupportingModel {
	// TODO Special logic for div after dl,dt,dd element

	@Override
	TagDiv getTagType();

}
