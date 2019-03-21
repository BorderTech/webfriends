package com.github.bordertech.webfriends.api.common.model;

/**
 * Model controls what content each element is allowed to wrap (ie children).
 */
public interface ElementModel {

	/**
	 * @return true if allowed content
	 */
	default boolean isAllowedContent() {
		return false;
	}

}
