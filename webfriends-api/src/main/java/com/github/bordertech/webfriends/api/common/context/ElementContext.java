package com.github.bordertech.webfriends.api.common.context;

/**
 * Contexts in which an element can be used (ie parent).
 */
public interface ElementContext {

	/**
	 * @return true if context allowed
	 */
	public default boolean isAllowedContext() {
		return false;
	}
}
