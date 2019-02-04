package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.combo.FlowPalpableElement;
import com.github.bordertech.webfriends.api.common.model.ScriptSupportingModel;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Div element.
 */
public interface HDiv extends FlowPalpableElement, ScriptSupportingModel {
	// TODO Special logic for div after dl,dt,dd element

	@Override
	public default ElementTag<? extends HDiv> getElementTag() {
		return StandardTags.DIV;
	}

}
