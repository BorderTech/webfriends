package com.github.bordertech.webfriends.selenium.smart.driver;

import com.github.bordertech.webfriends.selenium.common.form.category.LabelableSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tag.TagTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.SElement;
import com.github.bordertech.webfriends.selenium.element.form.SButton;
import com.github.bordertech.webfriends.selenium.util.driver.FriendDriver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Smart Elements Web Driver.
 */
public class SmartDriver extends FriendDriver {

	/**
	 * Default constructor.
	 */
	public SmartDriver() {
		// Do nothing
	}

	/**
	 * @param webDriver the backing web driver
	 */
	public SmartDriver(final WebDriver webDriver) {
		super(webDriver);
	}

	/**
	 * Set focus to this element.
	 *
	 * @param element the element to focus
	 */
	public void setFocus(final SElement element) {
		setFocus(element.getWebElement());
	}

	/**
	 * Find a button with the matching text.
	 *
	 * @param text the text of the button
	 * @return the button element or null
	 */
	public SButton findButton(final String text) {
		return findButton(text, false);
	}

	/**
	 * Find a button with the matching text.
	 *
	 * @param text the text of the button
	 * @param partial true if partial match
	 * @return the button element or null
	 */
	public SButton findButton(final String text, final boolean partial) {
		return SmartDriverUtil.findButton(this, getWebDriver(), text, partial);
	}

	/**
	 * Find a labeled element with the exact text.
	 *
	 * @param <T> the element tag type
	 * @param elementTag the element tag
	 * @param text the text of the button
	 * @return the labeled element or null
	 */
	public <T extends LabelableSelenium> T findLabeled(final TagTypeSelenium<T> elementTag, final String text) {
		return findLabeled(elementTag, text, false);
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
	public <T extends LabelableSelenium> T findLabeled(final TagTypeSelenium<T> elementTag, final String text, final boolean partial) {
		return SmartDriverUtil.findLabeled(this, getWebDriver(), elementTag, text, partial);
	}

	/**
	 * Find the first element with the tag type and exact text.
	 *
	 * @param <T> the element tag type
	 * @param elementTag the element tag
	 * @param text the text of the button
	 * @return the labeled element or null
	 */
	public <T extends SElement> T findWithText(final TagTypeSelenium<T> elementTag, final String text) {
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
	public <T extends SElement> T findWithText(final TagTypeSelenium<T> elementTag, final String text, final boolean partial) {
		return SmartDriverUtil.findWithText(this, getWebDriver(), elementTag, text, partial);
	}

	/**
	 * Find the first child element with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> T findWebFriend(final TagTypeSelenium<T> elementTag) {
		return SmartDriverUtil.findWebFriend(this, getWebDriver(), elementTag);
	}

	/**
	 * Find the first child element with this Tag Type and By.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @param by the by condition
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> T findWebFriend(final TagTypeSelenium<T> elementTag, final By by) {
		return SmartDriverUtil.findWebFriend(this, getWebDriver(), elementTag, by);
	}

	/**
	 * Find the nth (starting at 1) child element with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @param idx the nth element (starting at 1)
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> T findWebFriendNth(final TagTypeSelenium<T> elementTag, final int idx) {
		return SmartDriverUtil.findWebFriendNth(this, getWebDriver(), elementTag, idx);
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
	public <T extends SElement> T findWebFriendNth(final TagTypeSelenium<T> elementTag, final By by, final int idx) {
		return SmartDriverUtil.findWebFriendNth(this, getWebDriver(), elementTag, by, idx);
	}

	/**
	 * Find the child elements with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> List<T> findWebFriends(final TagTypeSelenium<T> elementTag) {
		return SmartDriverUtil.findWebFriends(this, getWebDriver(), elementTag);
	}

	/**
	 * Find the child elements with this tag type and By.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @param by the BY condition
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> List<T> findWebFriends(final TagTypeSelenium<T> elementTag, final By by) {
		return SmartDriverUtil.findWebFriends(this, getWebDriver(), elementTag, by);
	}

	/**
	 * Find the first child element for a tag type.
	 *
	 * @param elementTag the element tag
	 * @return the matching element or null
	 */
	public WebElement findWebElement(final TagTypeSelenium elementTag) {
		return SmartDriverUtil.findWebElement(getWebDriver(), elementTag);
	}

	/**
	 * Find the first child element for a tag type.
	 *
	 * @param elementTag the element tag
	 * @param relative make the context relative
	 * @return the matching element or null
	 */
	public WebElement findWebElement(final TagTypeSelenium elementTag, final boolean relative) {
		return SmartDriverUtil.findWebElement(getWebDriver(), elementTag, relative);
	}

	/**
	 * Find the first child element for a tag type and By.
	 *
	 * @param elementTag the element tag
	 * @param by the by condition
	 * @return the matching element or null
	 */
	public WebElement findWebElement(final TagTypeSelenium elementTag, final By by) {
		return SmartDriverUtil.findWebElement(getWebDriver(), elementTag, by);
	}

	/**
	 * Find the nth child element for a tag type.
	 *
	 * @param elementTag the element tag
	 * @param idx the nth element (starting at 1)
	 * @return the matching element or null
	 */
	public WebElement findWebElementNth(final TagTypeSelenium elementTag, final int idx) {
		return SmartDriverUtil.findWebElementNth(getWebDriver(), elementTag, idx);
	}

	/**
	 * Find the nth child element for a tag type and By.
	 *
	 * @param elementTag the element tag
	 * @param by the by condition
	 * @param idx the nth element (starting at 1)
	 * @return the matching element or null
	 */
	public WebElement findWebElementNth(final TagTypeSelenium elementTag, final By by, final int idx) {
		return SmartDriverUtil.findWebElementNth(getWebDriver(), elementTag, by, idx);
	}

	/**
	 * Find the child elements for a tag type.
	 *
	 * @param elementTag the element tag
	 * @return the matching elements.
	 */
	public List<WebElement> findWebElements(final TagTypeSelenium elementTag) {
		return SmartDriverUtil.findWebElements(getWebDriver(), elementTag);
	}

	/**
	 * Find the child elements for a tag type and By.
	 *
	 * @param elementTag the element tag
	 * @param by the by condition
	 * @return the matching elements.
	 */
	public List<WebElement> findWebElements(final TagTypeSelenium elementTag, final By by) {
		return SmartDriverUtil.findWebElements(getWebDriver(), elementTag, by);
	}

	/**
	 *
	 * Finds the webfriend of a child elements parent
	 *
	 * @param childWebElement the child web element
	 * @param elementTag the element tag to wrap element with
	 * @param <T> the web friends element type returned
	 * @return
	 */
	public <T extends SElement> T findWebFriendParent(final WebElement childWebElement, final TagTypeSelenium<T> elementTag) {
		return SmartDriverUtil.findWebFriendParent(this, childWebElement, elementTag);
	}

	/**
	 *
	 * Finds the webfriend of a child elements parent
	 *
	 * @param childElement the child element
	 * @param elementTag the element tag to wrap element with
	 * @param <T> the web friends element type returned
	 * @param <I> the web friends element type input
	 * @return
	 */
	public <T extends SElement, I extends SElement> T findWebFriendParent(final I childElement, final TagTypeSelenium<T> elementTag) {
		return SmartDriverUtil.findWebFriendParent(this, childElement, elementTag);
	}

	/**
	 * @param key the access key
	 */
	public void sendAccessKey(final String key) {
		WebElement body = findWebElement(SeleniumTags.BODY);
		body.sendKeys(Keys.chord(Keys.ALT + key));
	}

	/**
	 * Send tab forward key.
	 */
	public void sendTabForward() {
		WebElement body = findWebElement(SeleniumTags.BODY);
		body.sendKeys(Keys.chord(Keys.TAB));
	}

	/**
	 * Send tab backwards key.
	 */
	public void sendTabBackward() {
		WebElement body = findWebElement(SeleniumTags.BODY);
		StringBuilder keys = new StringBuilder();
		keys.append(Keys.SHIFT);
		keys.append(Keys.TAB);
		body.sendKeys(Keys.chord(keys.toString()));
	}

}
