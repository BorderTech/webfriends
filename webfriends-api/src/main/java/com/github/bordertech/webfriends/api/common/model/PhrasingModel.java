package com.github.bordertech.webfriends.api.common.model;

import com.github.bordertech.webfriends.api.common.category.PhrasingContent;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Element with a phrasing content model.
 */
public interface PhrasingModel extends AllowedModel {

	@Override
	default List<Class<? extends Element>> getDescendantsAllowed() {
		return Arrays.asList(PhrasingContent.class);
	}

}
