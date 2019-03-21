package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;
import com.github.bordertech.webfriends.api.common.tags.TagUnorderedListItem;

/**
 * List item element.
 */
public interface HUnorderedListItem extends ListItemElement {

	@Override
	TagUnorderedListItem getTagType();

	@Override
	default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(HUnorderedList.class);
	}

}
