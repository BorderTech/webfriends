package com.github.bordertech.webfriends.selenium.common.feature;

import com.github.bordertech.webfriends.selenium.common.category.LabelableSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.TagTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.SElement;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriverUtil;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Element with child elements.
 */
public interface ContainerWithChildren extends SElement {

	/**
	 * Find a labeled element with the exact text.
	 *
	 * @param <T> the element tag type
	 * @param elementTag the element tag
	 * @param text the text of the button
	 * @return the labeled element or null
	 */
	default <T extends LabelableSelenium> T findLabelled(final TagTypeSelenium<T> elementTag, final String text) {
		return findLabelled(elementTag, text, false);
	}

	/**
	 * Find a labeled element with the matching text.
	 *
	 * @param <T> the element tag type
	 * @param elementTag the element tag
	 * @param text the text of the button
	 * @param partial true if partial match
	 * @return the labeled element or null
	 */
	default <T extends LabelableSelenium> T findLabelled(final TagTypeSelenium<T> elementTag, final String text, final boolean partial) {
		return SmartDriverUtil.findLabeled(getDriver(), getWebElement(), elementTag, text, partial);
	}

	/**
	 * Find the first element with the tag type and exact text.
	 *
	 * @param <T> the element tag type
	 * @param elementTag the element tag
	 * @param text the text of the button
	 * @return the labeled element or null
	 */
	default <T extends SElement> T findWithText(final TagTypeSelenium<T> elementTag, final String text) {
		return findWithText(elementTag, text, true);
	}

	/**
	 * Find the first element with the tag type and matching text.
	 *
	 * @param <T> the element tag type
	 * @param elementTag the element tag
	 * @param text the text of the button
	 * @param partial true if partial match
	 * @return the labeled element or null
	 */
	default <T extends SElement> T findWithText(final TagTypeSelenium<T> elementTag, final String text, final boolean partial) {
		return SmartDriverUtil.findWithText(getDriver(), getWebElement(), elementTag, text, partial);
	}

	/**
	 * Find the first child element with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	default <T extends SElement> T findWebFriend(final TagTypeSelenium<T> elementTag) {
		return SmartDriverUtil.findWebFriend(getDriver(), getWebElement(), elementTag);
	}

	/**
	 * Find the first child element with this Tag Type and By.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @param by the by condition
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	default <T extends SElement> T findWebFriend(final TagTypeSelenium<T> elementTag, final By by) {
		return SmartDriverUtil.findWebFriend(getDriver(), getWebElement(), elementTag, by);
	}

	/**
	 * Find the nth (starting at 1) child element with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @param idx the nth element (starting at 1)
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	default <T extends SElement> T findWebFriendNth(final TagTypeSelenium<T> elementTag, final int idx) {
		return SmartDriverUtil.findWebFriendNth(getDriver(), getWebElement(), elementTag, idx);
	}

	/**
	 * Find the nth (starting at 1) child element with this tag type and By.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @param by the by condition
	 * @param idx the nth element (starting at 1)
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	default <T extends SElement> T findWebFriendNth(final TagTypeSelenium<T> elementTag, final By by, final int idx) {
		return SmartDriverUtil.findWebFriendNth(getDriver(), getWebElement(), elementTag, by, idx);
	}

	/**
	 * Find the child elements with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	default <T extends SElement> List<T> findWebFriends(final TagTypeSelenium<T> elementTag) {
		return SmartDriverUtil.findWebFriends(getDriver(), getWebElement(), elementTag);
	}

	/**
	 * Find the child elements with this tag type and By.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @param by the BY condition
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	default <T extends SElement> List<T> findWebFriends(final TagTypeSelenium<T> elementTag, final By by) {
		return SmartDriverUtil.findWebFriends(getDriver(), getWebElement(), elementTag, by);
	}

	/**
	 * Find the first child element for a tag type.
	 *
	 * @param elementTag the element tag
	 * @return the matching element or null
	 */
	default WebElement findWebElement(final TagTypeSelenium elementTag) {
		return SmartDriverUtil.findWebElement(getWebElement(), elementTag);
	}

	/**
	 * Find the first child element for a tag type and By.
	 *
	 * @param elementTag the element tag
	 * @param by the by condition
	 * @return the matching element or null
	 */
	default WebElement findWebElement(final TagTypeSelenium elementTag, final By by) {
		return SmartDriverUtil.findWebElement(getWebElement(), elementTag, by);
	}

	/**
	 * Find the nth child element for a tag type.
	 *
	 * @param elementTag the element tag
	 * @param idx the nth element (starting at 1)
	 * @return the matching element or null
	 */
	default WebElement findWebElementNth(final TagTypeSelenium elementTag, final int idx) {
		return SmartDriverUtil.findWebElementNth(getWebElement(), elementTag, idx);
	}

	/**
	 * Find the nth child element for a tag type and By.
	 *
	 * @param elementTag the element tag
	 * @param by the by condition
	 * @param idx the nth element (starting at 1)
	 * @return the matching element or null
	 */
	default WebElement findWebElementNth(final TagTypeSelenium elementTag, final By by, final int idx) {
		return SmartDriverUtil.findWebElementNth(getWebElement(), elementTag, by, idx);
	}

	/**
	 * Find the child elements for a tag type.
	 *
	 * @param elementTag the element tag
	 * @return the matching elements.
	 */
	default List<WebElement> findWebElements(final TagTypeSelenium elementTag) {
		return SmartDriverUtil.findWebElements(getWebElement(), elementTag);
	}

	/**
	 * Find the child elements for a tag type and By.
	 *
	 * @param elementTag the element tag
	 * @param by the by condition
	 * @return the matching elements.
	 */
	default List<WebElement> findWebElements(final TagTypeSelenium elementTag, final By by) {
		return SmartDriverUtil.findWebElements(getWebElement(), elementTag, by);
	}
}
