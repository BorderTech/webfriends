package com.github.bordertech.webfriends.api.common.model;

import com.github.bordertech.webfriends.api.element.Element;
import java.util.Collections;
import java.util.List;

/**
 * Model controls what content each element is allowed to wrap (ie children).
 */
public interface AllowedModel extends ElementModel {

	@Override
	default boolean isAllowedContent() {
		return true;
	}

	/**
	 * @return the list of direct child elements
	 */
	default List<? extends Element> getChildElements() {
		return Collections.emptyList();
	}

	/**
	 * The list of direct child elements allowed. If empty, then the list of allowed descendants is checked.
	 *
	 * @return the list of child elements allowed in the model
	 */
	default List<Class<? extends Element>> getChildrenAllowed() {
		return Collections.emptyList();
	}

	/**
	 * This list can be used to narrow down the children allowed.
	 *
	 * @return the list of child elements not allowed (ie excluded)
	 */
	default List<Class<? extends Element>> getChildrenExcluded() {
		return Collections.emptyList();
	}

	/**
	 * @return the list of descendant elements allowed in the model
	 */
	default List<Class<? extends Element>> getDescendantsAllowed() {
		return Collections.emptyList();
	}

	/**
	 * This list can be used to narrow down the descendants allowed.
	 *
	 * @return the list of descendant elements not allowed in the model
	 */
	default List<Class<? extends Element>> getDescendantsExcluded() {
		return Collections.emptyList();
	}

}
