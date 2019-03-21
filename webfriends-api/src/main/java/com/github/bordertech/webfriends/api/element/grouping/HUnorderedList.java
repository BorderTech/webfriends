package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.category.ScriptSupporting;
import com.github.bordertech.webfriends.api.common.tags.TagUnorderedList;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * List (unordered) element.
 *
 * @param <T> the list item type
 */
public interface HUnorderedList<T extends HUnorderedListItem> extends ListContainerElement<T> {

	@Override
	TagUnorderedList getTagType();

	@Override
	default List<Class<? extends Element>> getChildrenAllowed() {
		return Arrays.asList(ScriptSupporting.class, HUnorderedListItem.class);
	}
}
