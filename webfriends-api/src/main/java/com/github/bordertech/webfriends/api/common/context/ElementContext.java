package com.github.bordertech.webfriends.api.common.context;

import java.io.Serializable;

/**
 * Contexts in which an element can be used (ie parent).
 */
public interface ElementContext extends Serializable {

	/**
	 * @return true if context allowed
	 */
	public default boolean isAllowedContext() {
		return false;
	}
}
