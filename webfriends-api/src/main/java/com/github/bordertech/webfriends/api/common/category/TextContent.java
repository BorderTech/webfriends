package com.github.bordertech.webfriends.api.common.category;

/**
 * Text content is an element with a text value (ie text node).
 */
public interface TextContent extends Category {

	/**
	 * @return the text value for this element
	 */
	String getTextValue();
}
