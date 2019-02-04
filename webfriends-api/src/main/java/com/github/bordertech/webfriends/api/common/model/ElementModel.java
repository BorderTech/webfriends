package com.github.bordertech.webfriends.api.common.model;

import java.io.Serializable;

/**
 * Model controls what content each element is allowed to wrap (ie children).
 */
public interface ElementModel extends Serializable {

	/**
	 * @return true if allowed content
	 */
	public default boolean isAllowedContent() {
		return false;
	}

}
