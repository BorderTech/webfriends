package com.github.bordertech.webfriends.api.common.context;

import com.github.bordertech.webfriends.api.common.category.EmbeddedContent;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Element that can be added to a Embedded context.
 */
public interface EmbeddedContext extends AllowedContext {

	@Override
	default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(EmbeddedContent.class);
	}

}
