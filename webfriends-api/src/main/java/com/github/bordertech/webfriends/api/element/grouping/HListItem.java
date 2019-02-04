package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * List item element.
 */
public interface HListItem extends ListItem {

	@Override
	public default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(HList.class);
	}

}
