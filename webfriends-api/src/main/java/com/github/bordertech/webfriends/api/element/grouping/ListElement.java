package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.category.ScriptSupporting;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.model.ScriptSupportingModel;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * List element.
 * <p>
 * Is Flow content and Palpable content if the element's children include at least one li element.
 * </p>
 * <p>
 * Content model is zero or more li and script-supporting elements.
 * </p>
 *
 * @param <T> the list item type
 */
public interface ListElement<T extends ListItem> extends FlowContent, PalpableContent, FlowContext,
		ScriptSupportingModel, CustomModel {

	@Override
	public ElementTag<? extends ListElement> getElementTag();

	/**
	 * @return the list of items
	 */
	List<T> getListItems();

	@Override
	default List<Class<? extends Element>> getChildrenAllowed() {
		return Arrays.asList(ScriptSupporting.class, ListItem.class);
	}

}
