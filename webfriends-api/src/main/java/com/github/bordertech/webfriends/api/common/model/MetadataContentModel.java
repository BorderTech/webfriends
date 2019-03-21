package com.github.bordertech.webfriends.api.common.model;

import com.github.bordertech.webfriends.api.common.category.MetadataContent;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Element with a metadata content model.
 */
public interface MetadataContentModel extends AllowedModel {

	@Override
	default List<Class<? extends Element>> getChildrenAllowed() {
		return Arrays.asList(MetadataContent.class);
	}

}
