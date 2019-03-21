package com.github.bordertech.webfriends.api.common.tags;

import com.github.bordertech.webfriends.api.common.tag.Qualifier;
import com.github.bordertech.webfriends.api.common.tag.TagListItemType;
import com.github.bordertech.webfriends.api.element.grouping.HMenuItem;
import java.util.Arrays;
import java.util.List;

/**
 * HTML <code>li</code> menu item tag.
 *
 * @param <T> the element type
 */
public interface TagMenuItem<T extends HMenuItem> extends TagListItemType<T> {

	@Override
	public default String getTagName() {
		return "label";
	}

	@Override
	public default List<Qualifier> getQualifiers() {
		return Arrays.asList(Qualifier.create("ismenu"));
	}
}
