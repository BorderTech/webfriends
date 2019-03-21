package com.github.bordertech.webfriends.api.common.model;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Element with a flow content model.
 */
public interface FlowModel extends AllowedModel {

	@Override
	default List<Class<? extends Element>> getDescendantsAllowed() {
		return Arrays.asList(FlowContent.class);
	}

}
