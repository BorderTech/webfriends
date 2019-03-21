package com.github.bordertech.webfriends.api.common.model;

import com.github.bordertech.webfriends.api.common.category.ScriptSupporting;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Element with a script supporting content model.
 */
public interface ScriptSupportingModel extends AllowedModel {

	@Override
	default List<Class<? extends Element>> getChildrenAllowed() {
		return Arrays.asList(ScriptSupporting.class);
	}

}
