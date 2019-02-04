package com.github.bordertech.webfriends.selenium.util.helper.provider;

import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

/**
 * Find a element provider.
 */
public interface FindElementProvider extends ElementUtilProvider {

	/**
	 * Find the first child element (ie relative) for a tag type.
	 *
	 * @param context the search context.
	 * @param elementTag the element tag
	 * @return the matching element or null
	 */
	public default WebElement findWebElement(final SearchContext context, final SeleniumTag elementTag) {
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
	public default WebElement findWebElement(final SearchContext context, final SeleniumTag elementTag, final boolean relative) {
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
	public default WebElement findWebElement(final SearchContext context, final SeleniumTag elementTag, final By by) {
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
	public default WebElement findWebElementNth(final SearchContext context, final SeleniumTag elementTag, final int idx) {
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
	public default WebElement findWebElementNth(final SearchContext context, final SeleniumTag elementTag, final int idx, final boolean relative) {
		List<WebElement> elements = findWebElements(context, elementTag, relative);
		return filterWebElementsNth(elements, elementTag, idx);
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
	public default WebElement findWebElementNth(final SearchContext context, final SeleniumTag elementTag, final By by, final int idx) {
		List<WebElement> elements = findWebElements(context, elementTag, by);
		return filterWebElementsNth(elements, elementTag, idx);
	}

	/**
	 * Find the child elements (ie relative) for tag type.
	 *
	 * @param context the search context
	 * @param elementTag the element tag
	 * @return the matching elements
	 */
	public default List<WebElement> findWebElements(final SearchContext context, final SeleniumTag elementTag) {
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
	public default List<WebElement> findWebElements(final SearchContext context, final SeleniumTag elementTag, final boolean relative) {
		By by = buildSeleniumTabBy(elementTag, relative);
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
	public default List<WebElement> findWebElements(final SearchContext context, final SeleniumTag elementTag, final By by) {
		List<WebElement> elements = context.findElements(by);
		return filterWebElements(elements, elementTag);
	}

	/**
	 * Build the BY for a tag type.
	 *
	 * @param tag the element tag
	 * @param relative true if relative search
	 * @return the BY for the element
	 */
	public default By buildSeleniumTabBy(final SeleniumTag<?> tag, final boolean relative) {
		return By.xpath(tag.getXPath(relative));
	}

}
