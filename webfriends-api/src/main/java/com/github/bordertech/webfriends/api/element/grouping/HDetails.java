package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.combo.FlowPalpableElement;
import com.github.bordertech.webfriends.api.common.model.ScriptSupportingModel;
import com.github.bordertech.webfriends.api.common.tags.TagDetails;

/**
 * Details element.
 */
public interface HDetails extends FlowPalpableElement, ScriptSupportingModel {

	@Override
	TagDetails getTagType();

}
