package com.github.bordertech.webfriends.api.common.context;

import com.github.bordertech.webfriends.api.element.Element;
import java.util.Collections;
import java.util.List;

/**
 * Contexts in which an element can be used (ie parent).
 */
public interface AllowedContext extends ElementContext {

	@Override
	public default boolean isAllowedContext() {
		return true;
	}

	/**
	 * @return the parent element
	 */
	public default Element getParentElement() {
		return null;
	}

	/**
	 * @return the list of contexts this element can be added to
	 */
	public default List<Class<? extends Element>> getContextsAllowed() {
		return Collections.emptyList();
	}

	/**
	 * This list can be used to narrow down the contexts allowed.
	 *
	 * @return the list of contexts this element cant be added to (ie excluded)
	 */
	public default List<Class<? extends Element>> getContextsExcluded() {
		return Collections.emptyList();
	}

}
