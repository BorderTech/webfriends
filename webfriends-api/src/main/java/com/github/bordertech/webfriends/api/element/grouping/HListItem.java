package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.category.NoCategory;
import com.github.bordertech.webfriends.api.common.context.CustomContext;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.tags.TagLI;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * List item element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/li">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-li-element">HTML Spec</a>
 */
public interface HListItem extends NoCategory, CustomContext, FlowModel {

	@Override
	TagLI getTagType();

	/**
	 * @return ordinal value of the item (when in ordered list)
	 */
	int getOrdinalValue();

	@Override
	default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(ListContainerElement.class);
	}

}
