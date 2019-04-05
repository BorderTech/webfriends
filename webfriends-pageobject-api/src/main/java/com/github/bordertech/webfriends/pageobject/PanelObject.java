package com.github.bordertech.webfriends.pageobject;

/**
 * Panel objects provide the functionality of a smaller section of a web page.
 *
 * @param <T> the panel object type
 *
 * @see PageObject
 */
public interface PanelObject<T extends PanelObject> {

	/**
	 * Verify the panel is loaded and in the correct state.
	 *
	 * @return the panel for chaining
	 */
	T verifyPanel();

}
