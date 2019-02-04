package com.github.bordertech.webfriends.api.common.model;

/**
 * Element with text content so holds no "children".
 */
public interface TextModel extends ElementModel {

	/**
	 * @return the element text value.
	 */
	String getTextValue();
}
