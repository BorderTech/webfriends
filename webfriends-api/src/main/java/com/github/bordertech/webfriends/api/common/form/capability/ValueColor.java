package com.github.bordertech.webfriends.api.common.form.capability;

/**
 * Color value accessors.
 */
public interface ValueColor extends ValueSingle {

	/**
	 * @return the value as a color
	 */
	String getValueAsColor();

	/**
	 * @param color the color value (eg #000000)
	 */
	void setValueAsColor(final String color);

}
