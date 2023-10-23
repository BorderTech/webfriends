package com.github.bordertech.webfriends.api.common.context;

/**
 * Contexts in which an element can be used (ie parent).
 *
 * @see <a href="https://html.spec.whatwg.org/#concept-element-contexts">HTML Spec</a>
 */
public interface ElementContext {

	/**
	 * @return true if context allowed
	 */
	default boolean isAllowedContext() {
		return false;
	}
}
