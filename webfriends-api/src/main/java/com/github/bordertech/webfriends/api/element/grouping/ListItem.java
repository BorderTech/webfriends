package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.category.NoCategory;
import com.github.bordertech.webfriends.api.common.context.CustomContext;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * List item element.
 * <p>
 * List item can only be added to a list element.
 * </p>
 */
public interface ListItem extends NoCategory, CustomContext, FlowModel {

	@Override
	public default ElementTag<? extends ListItem> getElementTag() {
		return StandardTags.LISTITEM;
	}

	@Override
	public default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(ListElement.class);
	}

}
