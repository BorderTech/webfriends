package com.github.bordertech.webfriends.selenium.smart.driver;

import com.github.bordertech.webfriends.selenium.common.category.LabelableSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tag.TagTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.SElement;
import com.github.bordertech.webfriends.selenium.element.form.SButton;
import com.github.bordertech.webfriends.selenium.util.driver.FriendDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Smart Elements Web Driver.
 */
public class SmartDriver extends FriendDriver {

	/**
	 * Default constructor.
	 */
	public SmartDriver() {
	}

	/**
	 * @param webDriver the backing web driver
	 */
	public SmartDriver(final WebDriver webDriver) {
		super(webDriver);
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
	 * @param text          the text of the button
	 * @param searchContext the search context to use
	 * @return the button element or null
	 */
	public SButton findButton(final String text, final SearchContext searchContext) {
		return getHelper().findButton(this, searchContext, text, false);
	}

	/**
	 * Find a button with the matching text with search context.
	 *
	 * @param text          the text of the button
	 * @param searchContext the search context to use
	 * @param partial       true if partial match
	 * @return the button element or null
	 */
	public SButton findButton(final String text, final SearchContext searchContext, final boolean partial) {
		return getHelper().findButton(this, searchContext, text, partial);
	}

	/**
	 * Find a button with the matching text.
	 *
	 * @param text the text of the button
	 * @param partial true if partial match
	 * @return the button element or null
	 */
	public SButton findButton(final String text, final boolean partial) {
		return getHelper().findButton(this, getWebDriver(), text, partial);
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
	 * Find a labeled element with the exact text with search context.
	 *
	 * @param <T>           the element tag type
	 * @param elementTag    the element tag
	 * @param searchContext the search context
	 * @param text          the text of the button
	 * @return the labeled element or null
	 */
	public <T extends LabelableSelenium> T findLabeled(final TagTypeSelenium<T> elementTag, final SearchContext searchContext, final String text) {
		return findLabeled(elementTag, searchContext, text, false);
	}

	/**
	 * Find a labeled element with the matching text.
	 *
	 * @param <T>           the element tag type
	 * @param elementTag    the element tag
	 * @param searchContext the search context
	 * @param text          the text of the button
	 * @param partial       true if partial match
	 * @return the labeled element or null
	 */
	public <T extends LabelableSelenium> T findLabeled(final TagTypeSelenium<T> elementTag, final SearchContext searchContext, final String text, final boolean partial) {
		return getHelper().findLabeled(this, searchContext, elementTag, text, partial);
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
		return getHelper().findLabeled(this, getWebDriver(), elementTag, text, partial);
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
	 * Find the first element with the tag type and matching text with search context.
	 *
	 * @param <T>        the element tag type
	 * @param elementTag the element tag
	 * @param searchContext the search context
	 * @param text       the text of the button
	 * @return the labeled element or null
	 */
	public <T extends SElement> T findWithText(final TagTypeSelenium<T> elementTag, final SearchContext searchContext, final String text) {
		return getHelper().findWithText(this, searchContext, elementTag, text, true);
	}

	/**
	 * Find the first element with the tag type and matching text.
	 *
	 * @param <T>        the element tag type
	 * @param elementTag the element tag
	 * @param text       the text of the button
	 * @param partial    true if partial match
	 * @return the labeled element or null
	 */
	public <T extends SElement> T findWithText(final TagTypeSelenium<T> elementTag, final SearchContext searchContext, final String text, final boolean partial) {
		return getHelper().findWithText(this, searchContext, elementTag, text, partial);
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
		return getHelper().findWithText(this, getWebDriver(), elementTag, text, partial);
	}

	/**
	 * Find the first child element with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> T findWebFriend(final TagTypeSelenium<T> elementTag) {
		return getHelper().findWebFriend(this, getWebDriver(), elementTag);
	}

	/**
	 * Find the first child element with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @param searchContext the search context to use
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> T findWebFriend(final TagTypeSelenium<T> elementTag, final SearchContext searchContext) {
		return getHelper().findWebFriend(this, searchContext, elementTag);
	}


	/**
	 * Find the first child element with this Tag Type and By.
	 *
	 * @param <T>           the web friends element type
	 * @param searchContext the search context to use
	 * @param elementTag    the element tag
	 * @param by            the by condition
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> T findWebFriend(final TagTypeSelenium<T> elementTag, final SearchContext searchContext, final By by) {
		return getHelper().findWebFriend(this, searchContext, elementTag, by);
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
		return findWebFriend(elementTag, getWebDriver(), by);
	}

	/**
	 * Find the nth (starting at 1) child element with this tag type with search context.
	 *
	 * @param <T>        the web friends element type
	 * @param elementTag the element tag
	 * @param searchContext the search context to use
	 * @param idx        the nth element (starting at 1)
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> T findWebFriendNth(final TagTypeSelenium<T> elementTag, final SearchContext searchContext, final int idx) {
		return getHelper().findWebFriendNth(this, searchContext, elementTag, idx);
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
		return getHelper().findWebFriendNth(this, getWebDriver(), elementTag, idx);
	}

	/**
	 * Find the nth (starting at 1) child element with this tag type and By with search context.
	 *
	 * @param <T>        the web friends element type
	 * @param elementTag the element tag
	 * @param searchContext the search context to use
	 * @param by         the by condition
	 * @param idx        the nth element (starting at 1)
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> T findWebFriendNth(final TagTypeSelenium<T> elementTag, final SearchContext searchContext, final By by, final int idx) {
		return getHelper().findWebFriendNth(this, searchContext, elementTag, by, idx);
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
		return this.findWebFriendNth(elementTag, getWebDriver(), by, idx);
	}

	/**
	 * Find the child elements with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> List<T> findWebFriends(final TagTypeSelenium<T> elementTag) {
		return getHelper().findWebFriends(this, getWebDriver(), elementTag);
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
		return findWebFriends(elementTag, getWebDriver(), by);
	}

	/**
	 * Find the child elements with this tag type and By.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @param searchContext the search context to use
	 * @param by the BY condition
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> List<T> findWebFriends(final TagTypeSelenium<T> elementTag, final SearchContext searchContext, final By by) {
		return getHelper().findWebFriends(this, searchContext, elementTag, by);
	}

	/**
	 * Find the child elements with this tag type and By.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @param searchContext the search context to use
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> List<T> findWebFriends(final TagTypeSelenium<T> elementTag, final SearchContext searchContext) {
		return getHelper().findWebFriends(this, searchContext, elementTag);
	}

	/**
	 * Find the first child element for a tag type.
	 *
	 * @param elementTag the element tag
	 * @return the matching element or null
	 */
	public WebElement findWebElement(final TagTypeSelenium elementTag) {
		return getHelper().findWebElement(getWebDriver(), elementTag);
	}

	/**
	 * Find the first child element for a tag type.
	 *
	 * @param elementTag the element tag
	 * @param relative   make the context relative
	 * @return the matching element or null
	 */
	public WebElement findWebElement(final TagTypeSelenium elementTag, final boolean relative) {
		return getHelper().findWebElement(getWebDriver(), elementTag, relative);
	}

	/**
	 * Find the first child element for a tag type and By.
	 *
	 * @param elementTag the element tag
	 * @param by the by condition
	 * @return the matching element or null
	 */
	public WebElement findWebElement(final TagTypeSelenium elementTag, final By by) {
		return getHelper().findWebElement(getWebDriver(), elementTag, by);
	}

	/**
	 * Find the nth child element for a tag type.
	 *
	 * @param elementTag the element tag
	 * @param idx the nth element (starting at 1)
	 * @return the matching element or null
	 */
	public WebElement findWebElementNth(final TagTypeSelenium elementTag, final int idx) {
		return getHelper().findWebElementNth(getWebDriver(), elementTag, idx);
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
		return getHelper().findWebElementNth(getWebDriver(), elementTag, by, idx);
	}

	/**
	 * Find the child elements for a tag type.
	 *
	 * @param elementTag the element tag
	 * @return the matching elements.
	 */
	public List<WebElement> findWebElements(final TagTypeSelenium elementTag) {
		return getHelper().findWebElements(getWebDriver(), elementTag);
	}

	/**
	 * Find the child elements for a tag type and By.
	 *
	 * @param elementTag the element tag
	 * @param by the by condition
	 * @return the matching elements.
	 */
	public List<WebElement> findWebElements(final TagTypeSelenium elementTag, final By by) {
		return getHelper().findWebElements(getWebDriver(), elementTag, by);
	}

	/**
	 *
	 * Finds the webfriend of a child elements parent
	 * @param childWebElement the child web element
	 * @param elementTag the element tag to wrap element with
	 * @param <T> the web friends element type returned
	 * @return
	 */
	public <T extends SElement> T findWebFriendParent(final WebElement childWebElement, final TagTypeSelenium<T> elementTag) {
		return getHelper().findWebFriendParent(this, childWebElement, elementTag);
	}

	/**
	 *
	 * Finds the webfriend of a child elements parent
	 * @param childElement the child element
	 * @param elementTag the element tag to wrap element with
	 * @param <T> the web friends element type returned
	 * @param <I> the web friends element type input
	 * @return
	 */
	public <T extends SElement, I extends SElement> T findWebFriendParent(final I childElement, final TagTypeSelenium<T> elementTag) {
		return getHelper().findWebFriendParent(this, childElement, elementTag);
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

	/**
	 * @return the helper
	 */
	@Override
	public SmartHelperProvider getHelper() {
		return SmartHelper.getProvider();
	}

}
