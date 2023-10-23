package com.github.bordertech.webfriends.selenium.smart.driver;

import com.github.bordertech.webfriends.selenium.common.form.category.LabelableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.category.FormAssociatedSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tag.TagHeadingTypeSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.TagTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.SElement;
import com.github.bordertech.webfriends.selenium.element.form.SButton;
import com.github.bordertech.webfriends.selenium.element.form.SForm;
import com.github.bordertech.webfriends.selenium.element.sections.HeadingElementSelenium;
import com.github.bordertech.webfriends.selenium.smart.by.ByDesc;
import com.github.bordertech.webfriends.selenium.smart.by.ByLabel;
import com.github.bordertech.webfriends.selenium.smart.by.TextSearchOptions;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

/**
 * Helper class for SmartDriver.
 */
public class SmartDriverUtil {

	/**
	 * Prevent instantiation.
	 */
	private SmartDriverUtil() {
		// Do nothing
	}

	/**
	 * Finds the webfriend of a child elements parent
	 *
	 * @param driver the web driver
	 * @param childWebElement the child web element
	 * @param elementTag the element tag to wrap element with
	 * @param <T> the web friends element type
	 * @return
	 */
	public static <T extends SElement> T findWebFriendParent(final SmartDriver driver, final WebElement childWebElement, final TagTypeSelenium<T> elementTag) {
		return ElementUtil.wrapWebElement(driver, childWebElement.findElement(By.xpath("parent::*")), elementTag);
	}

	/**
	 *
	 * Finds the webfriend of a child elements parent
	 *
	 * @param driver the web driver
	 * @param childElement the child web element
	 * @param elementTag the element tag to wrap element with
	 * @param <T> the web friends element type returned
	 * @param <I> the web friends element type input
	 * @return
	 */
	public static <T extends SElement, I extends SElement> T findWebFriendParent(final SmartDriver driver, final I childElement, final TagTypeSelenium<T> elementTag) {
		return findWebFriendParent(driver, childElement.getWebElement(), elementTag);
	}

	/**
	 * Find the first child heading element (H1 to H6).
	 *
	 * @param driver the web driver
	 * @param context the search context
	 * @return the heading element or null
	 */
	public static HeadingElementSelenium findHeading(final SmartDriver driver, final SearchContext context) {
		// TODO Maybe switch this to a xpath
		// Check for H1 to H6
		for (TagHeadingTypeSelenium<? extends HeadingElementSelenium> tag : SeleniumTags.getHeadingTags()) {
			HeadingElementSelenium heading = findWebFriend(driver, context, tag);
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
	public static SButton findButton(final SmartDriver driver, final SearchContext context, final String text, final boolean partial) {
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
	public static <T extends LabelableSelenium> T findLabeled(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final String text, final boolean partial) {
		By by = ByLabel.text(text, partial, true);
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
	public static <T extends SElement> T findWithText(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final String text) {
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
	public static <T extends SElement> T findWithText(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final String text, final boolean partial) {
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
	public static <T extends SElement> T findWebFriend(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag) {
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
	public static <T extends SElement> T findWebFriend(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final boolean relative) {
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
	public static <T extends SElement> T findWebFriend(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final By by) {
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
	public static <T extends SElement> T findWebFriendNth(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final int idx) {
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
	public static <T extends SElement> T findWebFriendNth(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final int idx, final boolean relative) {
		WebElement element = findWebElementNth(context, elementTag, idx, relative);
		return element == null ? null : ElementUtil.wrapWebElement(driver, element, elementTag);
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
	public static <T extends SElement> T findWebFriendNth(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final By by, final int idx) {
		WebElement element = findWebElementNth(context, elementTag, by, idx);
		return element == null ? null : ElementUtil.wrapWebElement(driver, element, elementTag);
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
	public static <T extends SElement> List<T> findWebFriends(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag) {
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
	public static <T extends SElement> List<T> findWebFriends(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final boolean relative) {
		List<WebElement> elements = findWebElements(context, elementTag, relative);
		return ElementUtil.wrapWebElements(driver, elements, elementTag);
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
	public static <T extends SElement> List<T> findWebFriends(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final By by) {
		List<WebElement> elements = findWebElements(context, elementTag, by);
		return ElementUtil.wrapWebElements(driver, elements, elementTag);
	}

	/**
	 * Find the elements associated with this form.
	 *
	 * @param form the parent form
	 * @return the form associated elements
	 */
	public static List<FormAssociatedSelenium> findFormAssociated(final SForm form) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Find the first child element (ie relative) for a tag type.
	 *
	 * @param context the search context.
	 * @param elementTag the element tag
	 * @return the matching element or null
	 */
	public static WebElement findWebElement(final SearchContext context, final TagTypeSelenium elementTag) {
		return findWebElement(context, elementTag, true);
	}

	/**
	 * Find the first element for a tag type.
	 *
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param relative true if relative search
	 * @return the matching element or null
	 */
	public static WebElement findWebElement(final SearchContext context, final TagTypeSelenium elementTag, final boolean relative) {
		return findWebElementNth(context, elementTag, 1, relative);
	}

	/**
	 * Find the first element for a tag type and By (the By determines relative or root).
	 *
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param by the by condition which determines relative or root
	 * @return the matching element or null
	 */
	public static WebElement findWebElement(final SearchContext context, final TagTypeSelenium elementTag, final By by) {
		return findWebElementNth(context, elementTag, by, 1);
	}

	/**
	 * Find the nth child element (ie relative) for a tag type.
	 *
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param idx the nth (starting from 1) child element
	 * @return the matching element or null
	 */
	public static WebElement findWebElementNth(final SearchContext context, final TagTypeSelenium elementTag, final int idx) {
		return findWebElementNth(context, elementTag, idx, true);
	}

	/**
	 * Find the nth element for a tag type.
	 *
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param idx the nth (starting from 1) child element
	 * @param relative true if relative search
	 * @return the matching element or null
	 */
	public static WebElement findWebElementNth(final SearchContext context, final TagTypeSelenium elementTag, final int idx, final boolean relative) {
		List<WebElement> elements = findWebElements(context, elementTag, relative);
		return ElementUtil.filterWebElementsNth(elements, elementTag, idx);
	}

	/**
	 * Find the nth element for a tag type and By (the By determines relative or root).
	 *
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param by the by condition which determines relative or root
	 * @param idx the nth (starting from 1) child element
	 * @return the matching element or null
	 */
	public static WebElement findWebElementNth(final SearchContext context, final TagTypeSelenium elementTag, final By by, final int idx) {
		List<WebElement> elements = findWebElements(context, elementTag, by);
		return ElementUtil.filterWebElementsNth(elements, elementTag, idx);
	}

	/**
	 * Find the child elements (ie relative) for tag type.
	 *
	 * @param context the search context
	 * @param elementTag the element tag
	 * @return the matching elements
	 */
	public static List<WebElement> findWebElements(final SearchContext context, final TagTypeSelenium elementTag) {
		return findWebElements(context, elementTag, true);
	}

	/**
	 * Find the elements for tag type.
	 *
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param relative true if relative search
	 * @return the matching elements
	 */
	public static List<WebElement> findWebElements(final SearchContext context, final TagTypeSelenium elementTag, final boolean relative) {
		By by = ElementUtil.buildSeleniumTabBy(elementTag, relative);
		return context.findElements(by);
	}

	/**
	 * Find the elements for tag type and By (the By determines relative or root).
	 *
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param by the by condition which determines relative or root
	 * @return the matching elements
	 */
	public static List<WebElement> findWebElements(final SearchContext context, final TagTypeSelenium elementTag, final By by) {
		List<WebElement> elements = context.findElements(by);
		return ElementUtil.filterWebElements(elements, elementTag);
	}

	/**
	 * Find the elements labeled by this text.
	 *
	 * @param context the search context
	 * @param labelText the text used to find the label
	 * @param partialMatch whether it can be a partial text match
	 * @param relative whether to use a relative xpath lookup
	 * @return the elements labeled by this text
	 */
	public static List<WebElement> findLabeledElementsWithText(final SearchContext context, final String labelText, final boolean partialMatch, final boolean relative) {
		List<WebElement> labels = findLabelElements(context, labelText, partialMatch, relative);
		return ElementUtil.findLabeledElementsWithLabels(labels);
	}

	/**
	 * Find label elements by its text, either as an exact or partial match and using a relative XPATH.
	 *
	 * @param context the search context
	 * @param labelText the text used to find the label
	 * @param partialMatch whether it can be a partial text match
	 * @param relative whether to use a relative xpath lookup
	 * @return the elements labeled by this text
	 */
	public static List<WebElement> findLabelElements(final SearchContext context, final String labelText, final boolean partialMatch, final boolean relative) {
		TextSearchOptions options = TextSearchOptions.nodeOnly(labelText, partialMatch);
		return findElementsWithTextOptions(context, SeleniumTags.LABEL, options, relative);
	}

	/**
	 * Search for an element with text search options.
	 *
	 * @param context the search context
	 * @param options the text search options
	 * @param relative true if relative search
	 * @return the list of matching elements
	 */
	public static List<WebElement> findElementsWithTextOptions(final SearchContext context, final TextSearchOptions options, final boolean relative) {
		String prefix = relative ? ".//*" : "//*";
		String textX = ElementUtil.buildTextOptionsXPathFilter(options);
		return context.findElements(By.xpath(prefix + textX));
	}

	/**
	 * Search for an element with a tag type and text search options.
	 *
	 * @param context the search context
	 * @param elementTag the optional tag to search
	 * @param options the text search options
	 * @param relative true if relative search
	 * @return the list of matching elements
	 */
	public static List<WebElement> findElementsWithTextOptions(final SearchContext context, final TagTypeSelenium elementTag, final TextSearchOptions options, final boolean relative) {
		String prefix = elementTag.getXPath(relative);
		String textX = ElementUtil.buildTextOptionsXPathFilter(options);
		return context.findElements(By.xpath(prefix + textX));
	}

}
