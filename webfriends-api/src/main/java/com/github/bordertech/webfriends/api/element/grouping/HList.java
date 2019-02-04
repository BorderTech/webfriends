package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.category.ScriptSupporting;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * List (unordered) element.
 *
 * @param <T> the list item type
 */
public interface HList<T extends HListItem> extends ListElement<T> {

	@Override
	public default ElementTag<? extends HList> getElementTag() {
		return StandardTags.UL;
	}

	@Override
	public default List<Class<? extends Element>> getChildrenAllowed() {
		return Arrays.asList(ScriptSupporting.class, HListItem.class);
	}
}
