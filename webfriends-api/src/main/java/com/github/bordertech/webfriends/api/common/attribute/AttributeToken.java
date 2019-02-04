package com.github.bordertech.webfriends.api.common.attribute;

import java.io.Serializable;

/**
 * Attribute with the token value.
 */
public interface AttributeToken extends Serializable {

	/**
	 * @return the HTML attribute value
	 */
	String getToken();

}
