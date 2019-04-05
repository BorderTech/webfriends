package com.github.bordertech.webfriends.pageobject;

/**
 * Page objects provide the functionality of a particular web page.
 *
 * @param <T> the page object type
 *
 * @see ApplicationPageController
 */
public interface PageObject<T extends PageObject> {

	/**
	 * Refresh the page.
	 * <p>
	 * The contract of this method is it will also call {@link #verifyPage()}.
	 * </p>
	 *
	 * @return this page for chaining
	 */
	T refreshPage();

	/**
	 * Navigate to this page.
	 * <p>
	 * The contract of this method is it will also call {@link #verifyPage()}.
	 * </p>
	 *
	 *
	 * @return this page for chaining
	 */
	T navigateToPage();

	/**
	 * Verify page is loaded and in the correct state.
	 *
	 * @return this page for chaining
	 */
	T verifyPage();

	/**
	 * @return the page title
	 */
	String getPageTitle();

}
