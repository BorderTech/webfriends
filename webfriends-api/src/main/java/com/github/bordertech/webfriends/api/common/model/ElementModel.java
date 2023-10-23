package com.github.bordertech.webfriends.api.common.model;

/**
 * Model controls what content each element is allowed to wrap (ie children).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Content_categories">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#content-models">HTML Spec</a>
 */
public interface ElementModel {

	/**
	 * @return true if allowed content
	 */
	default boolean isAllowedContent() {
		return false;
	}

}
