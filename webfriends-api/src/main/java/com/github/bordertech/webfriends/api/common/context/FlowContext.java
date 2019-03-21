package com.github.bordertech.webfriends.api.common.context;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Element that can be added to a Flow context.
 */
public interface FlowContext extends AllowedContext {

	@Override
	default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(FlowContent.class);
	}

}
