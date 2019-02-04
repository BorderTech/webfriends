package com.github.bordertech.webfriends.api.common.attribute;

import java.io.Serializable;

/**
 * Attribute with a numeric token value.
 */
public interface AttributeNumericToken extends Serializable {

	/**
	 * @return the HTML attribute value
	 */
	Integer getToken();

}
