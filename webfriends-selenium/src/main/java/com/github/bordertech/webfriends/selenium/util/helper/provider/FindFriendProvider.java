package com.github.bordertech.webfriends.selenium.util.helper.provider;

import com.github.bordertech.webfriends.selenium.by.ByDesc;
import com.github.bordertech.webfriends.selenium.by.ByLabel;
import com.github.bordertech.webfriends.selenium.common.category.LabelableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.category.FormAssociatedSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.SElement;
import com.github.bordertech.webfriends.selenium.element.form.SButton;
import com.github.bordertech.webfriends.selenium.element.form.SForm;
import com.github.bordertech.webfriends.selenium.element.sections.HeadingElementSelenium;
import com.github.bordertech.webfriends.selenium.util.driver.FriendDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

/**
 * Find a friend provider.
 */
public interface FindFriendProvider extends ElementUtilProvider, FindElementProvider {

	/**
	 * Find the first child heading element (H1 to H6).
	 *
	 * @param driver the web driver
	 * @param context the search context
	 * @return the heading element or null
	 */
	public default HeadingElementSelenium findHeading(final FriendDriver driver, final SearchContext context) {
		// TODO Maybe switch this to a xpath
		// Check for H1 to H6
		for (SeleniumTag tag : SeleniumTags.HEADING_TAGS) {
			HeadingElementSelenium heading = (HeadingElementSelenium) FindFriendProvider.this.findWebFriend(driver, context, tag);
			if (heading != null) {
				return heading;
			}
		}
		return null;
	}

	/**
	 * Find the first button with the matching text.
	 *
	 * @param driver the web driver
	 * @param context the search context
	 * @param partial true if partial
	 * @param text the text of the button
	 * @return the button element or null
	 */
	public default SButton findButton(final FriendDriver driver, final SearchContext context, final String text, final boolean partial) {
		By by = ByDesc.text(SeleniumTags.BUTTON, text, partial, true);
		return findWebFriend(driver, context, SeleniumTags.BUTTON, by);
	}

	/**
	 * Find the first labeled element with the matching text.
	 *
	 * @param <T> the element tag type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param text the text of the button
	 * @param partial true if partial match
	 * @return the labeled element or null
	 */
	public default <T extends LabelableSelenium> T findLabeled(final FriendDriver driver, final SearchContext context, final SeleniumTag<T> elementTag, final String text, final boolean partial) {
		By by = ByLabel.text(text, partial);
		return findWebFriend(driver, context, elementTag, by);
	}

	/**
	 * Find the first element with the tag type and exact text.
	 *
	 * @param <T> the element tag type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param text the text of the button
	 * @return the labeled element or null
	 */
	public default <T extends SElement> T findWithText(final FriendDriver driver, final SearchContext context, final SeleniumTag<T> elementTag, final String text) {
		return findWithText(driver, context, elementTag, text, true);
	}

	/**
	 * Find the first element with the tag type and matching text.
	 *
	 * @param <T> the element tag type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param text the text of the button
	 * @param partial true if partial match
	 * @return the labeled element or null
	 */
	public default <T extends SElement> T findWithText(final FriendDriver driver, final SearchContext context, final SeleniumTag<T> elementTag, final String text, final boolean partial) {
		By by = ByDesc.text(elementTag, text, partial, true);
		return findWebFriend(driver, context, elementTag, by);
	}

	/**
	 * Find the first child element (ie relative) with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public default <T extends SElement> T findWebFriend(final FriendDriver driver, final SearchContext context, final SeleniumTag<T> elementTag) {
		return findWebFriend(driver, context, elementTag, true);
	}

	/**
	 * Find the first element with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param relative true if relative
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public default <T extends SElement> T findWebFriend(final FriendDriver driver, final SearchContext context, final SeleniumTag<T> elementTag, final boolean relative) {
		return findWebFriendNth(driver, context, elementTag, 1, relative);
	}

	/**
	 * Find the first child element with this Tag Type and By (the By determines relative or root).
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param by the by condition which determines relative or root
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public default <T extends SElement> T findWebFriend(final FriendDriver driver, final SearchContext context, final SeleniumTag<T> elementTag, final By by) {
		return findWebFriendNth(driver, context, elementTag, by, 1);
	}

	/**
	 * Find the nth (starting at 1) child element (ie relative) with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param idx the nth element (starting at 1)
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public default <T extends SElement> T findWebFriendNth(final FriendDriver driver, final SearchContext context, final SeleniumTag<T> elementTag, final int idx) {
		return findWebFriendNth(driver, context, elementTag, idx, true);
	}

	/**
	 * Find the nth (starting at 1) element with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param relative true if relative
	 * @param idx the nth element (starting at 1)
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public default <T extends SElement> T findWebFriendNth(final FriendDriver driver, final SearchContext context, final SeleniumTag<T> elementTag, final int idx, final boolean relative) {
		WebElement element = findWebElementNth(context, elementTag, idx, relative);
		return element == null ? null : wrapWebElement(driver, element, elementTag);
	}

	/**
	 * Find the nth (starting at 1) element with this tag type and By (the By determines relative or root).
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param by the by condition which determines relative or root
	 * @param idx the nth element (starting at 1)
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public default <T extends SElement> T findWebFriendNth(final FriendDriver driver, final SearchContext context, final SeleniumTag<T> elementTag, final By by, final int idx) {
		WebElement element = findWebElementNth(context, elementTag, by, idx);
		return element == null ? null : wrapWebElement(driver, element, elementTag);
	}

	/**
	 * Find the child elements (ie relative) with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @return the web friend wrappers for the matching element
	 */
	public default <T extends SElement> List<T> findWebFriends(final FriendDriver driver, final SearchContext context, final SeleniumTag<T> elementTag) {
		return findWebFriends(driver, context, elementTag, true);
	}

	/**
	 * Find the child elements with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param relative true if relative
	 * @return the web friend wrappers for the matching elements
	 */
	public default <T extends SElement> List<T> findWebFriends(final FriendDriver driver, final SearchContext context, final SeleniumTag<T> elementTag, final boolean relative) {
		List<WebElement> elements = findWebElements(context, elementTag, relative);
		return wrapWebElements(driver, elements, elementTag);
	}

	/**
	 * Find the child elements with this tag type and By (the By determine relative or root).
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param by the BY condition which determines relative or root
	 * @return the web friend wrappers for the matching element
	 */
	public default <T extends SElement> List<T> findWebFriends(final FriendDriver driver, final SearchContext context, final SeleniumTag<T> elementTag, final By by) {
		List<WebElement> elements = findWebElements(context, elementTag, by);
		return wrapWebElements(driver, elements, elementTag);
	}

	/**
	 * Find the elements associated with this form.
	 *
	 * @param form the parent form
	 * @return the form associated elements
	 */
	public default List<? extends FormAssociatedSelenium> getFormAssociated(final SForm form) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
