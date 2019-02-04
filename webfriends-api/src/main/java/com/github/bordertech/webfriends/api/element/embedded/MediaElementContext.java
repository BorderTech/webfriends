package com.github.bordertech.webfriends.api.element.embedded;

import com.github.bordertech.webfriends.api.common.context.CustomContext;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Element that can be added to a Media context.
 */
public interface MediaElementContext extends CustomContext {

	@Override
	public default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(MediaElement.class);
	}

}
