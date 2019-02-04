package com.github.bordertech.webfriends.selenium.util.driver;

import com.github.bordertech.webfriends.selenium.common.category.LabelableSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.SElement;
import com.github.bordertech.webfriends.selenium.element.form.SButton;
import com.github.bordertech.webfriends.selenium.util.helper.Helper;
import com.github.bordertech.webfriends.selenium.util.helper.HelperProvider;
import java.util.List;
import java.util.function.Function;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

/**
 * Friend Web Driver.
 */
public class FriendDriver implements TakesScreenshot {

	/**
	 * Session cookie String name.
	 */
	private static final String SESSION_ID_COOKIE = "JSESSIONID";
	private WebDriver webDriver = null;

	/**
	 * Default constructor.
	 */
	public FriendDriver() {
	}

	/**
	 * @param webDriver the backing web driver
	 */
	public FriendDriver(final WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	/**
	 * @param webDriver the backing web driver
	 */
	public void setWebDriver(final WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	/**
	 * @return the backing web driver
	 */
	public WebDriver getWebDriver() {
		return webDriver;
	}

	/**
	 * Start a new session, using the current URL.
	 */
	public void newSession() {
		newSession(getWebDriver().getCurrentUrl());
	}

	/**
	 * @return true if an active session exists, else false.
	 */
	public boolean hasSession() {
		return getSessionId() != null;
	}

	/**
	 * Start a new session with the given URL.
	 *
	 * @param url the URL of the page to load.
	 */
	public void newSession(final String url) {
		getWebDriver().manage().deleteAllCookies();
		navigateToUrl(url);
	}

	/**
	 * @return the session ID for the driver, or null if no session.
	 */
	public String getSessionId() {
		Cookie cookie = getWebDriver().manage().getCookieNamed(SESSION_ID_COOKIE);
		if (cookie == null) {
			return null;
		}
		return cookie.getValue();
	}

	/**
	 * Refresh page.
	 */
	public void refreshPage() {
		getWebDriver().navigate().refresh();
	}

	/**
	 * @param url the URL to navigate to
	 */
	public void navigateToUrl(final String url) {
		getWebDriver().navigate().to(url);
	}

	/**
	 * @return the Alert or null
	 */
	public Alert getAlert() {
		try {
			return getWebDriver().switchTo().alert();
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * @return the page title
	 */
	public String getPageTitle() {
		return getWebDriver().getTitle();
	}

	/**
	 * @return the current URL
	 */
	public String getCurrentUrl() {
		return getWebDriver().getCurrentUrl();
	}

	/**
	 * Close the current window.
	 */
	public void close() {
		getWebDriver().close();
	}

	/**
	 * Close all windows.
	 */
	public void quit() {
		getWebDriver().quit();
	}

	@Override
	public <X> X getScreenshotAs(final OutputType<X> target) throws WebDriverException {
		if (getWebDriver() instanceof TakesScreenshot) {
			return ((TakesScreenshot) getWebDriver()).getScreenshotAs(target);
		}
		throw new UnsupportedOperationException("Driver does not support task sreen shot.");
	}

	/**
	 * Wait for the page ready.
	 */
	public void waitForPageReady() {
		getHelper().waitForPageReady(getWebDriver());
	}

	/**
	 * Verify the correct page has been loaded.
	 *
	 * @param condition check if correct page loaded condition
	 */
	public void verifyPageLoaded(final Function<WebDriver, Boolean> condition) {
		getHelper().verifyPageLoaded(getWebDriver(), condition);
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
	public <T extends LabelableSelenium> T findLabeled(final SeleniumTag<T> elementTag, final String text) {
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
	public <T extends LabelableSelenium> T findLabeled(final SeleniumTag<T> elementTag, final String text, final boolean partial) {
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
	public <T extends SElement> T findWithText(final SeleniumTag<T> elementTag, final String text) {
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
	public <T extends SElement> T findWithText(final SeleniumTag<T> elementTag, final String text, final boolean partial) {
		return getHelper().findWithText(this, webDriver, elementTag, text, partial);
	}

	/**
	 * Find the first child element with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> T findWebFriend(final SeleniumTag<T> elementTag) {
		return getHelper().findWebFriend(this, getWebDriver(), elementTag);
	}

	/**
	 * Find the first child element with this Tag Type and By.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @param by the by condition
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> T findWebFriend(final SeleniumTag<T> elementTag, final By by) {
		return getHelper().findWebFriend(this, getWebDriver(), elementTag, by);
	}

	/**
	 * Find the nth (starting at 1) child element with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @param idx the nth element (starting at 1)
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> T findWebFriendNth(final SeleniumTag<T> elementTag, final int idx) {
		return getHelper().findWebFriendNth(this, getWebDriver(), elementTag, idx);
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
	public <T extends SElement> T findWebFriendNth(final SeleniumTag<T> elementTag, final By by, final int idx) {
		return getHelper().findWebFriendNth(this, getWebDriver(), elementTag, by, idx);
	}

	/**
	 * Find the child elements with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param elementTag the element tag
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> List<T> findWebFriends(final SeleniumTag<T> elementTag) {
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
	public <T extends SElement> List<T> findWebFriends(final SeleniumTag<T> elementTag, final By by) {
		return getHelper().findWebFriends(this, getWebDriver(), elementTag, by);
	}

	/**
	 * Find the first child element for a tag type.
	 *
	 * @param elementTag the element tag
	 * @return the matching element or null
	 */
	public WebElement findWebElement(final SeleniumTag elementTag) {
		return getHelper().findWebElement(getWebDriver(), elementTag);
	}

	/**
	 * Find the first child element for a tag type and By.
	 *
	 * @param elementTag the element tag
	 * @param by the by condition
	 * @return the matching element or null
	 */
	public WebElement findWebElement(final SeleniumTag elementTag, final By by) {
		return getHelper().findWebElement(getWebDriver(), elementTag, by);
	}

	/**
	 * Find the nth child element for a tag type.
	 *
	 * @param elementTag the element tag
	 * @param idx the nth element (starting at 1)
	 * @return the matching element or null
	 */
	public WebElement findWebElementNth(final SeleniumTag elementTag, final int idx) {
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
	public WebElement findWebElementNth(final SeleniumTag elementTag, final By by, final int idx) {
		return getHelper().findWebElementNth(getWebDriver(), elementTag, by, idx);
	}

	/**
	 * Find the child elements for a tag type.
	 *
	 * @param elementTag the element tag
	 * @return the matching elements.
	 */
	public List<WebElement> findWebElements(final SeleniumTag elementTag) {
		return getHelper().findWebElements(getWebDriver(), elementTag);
	}

	/**
	 * Find the child elements for a tag type and By.
	 *
	 * @param elementTag the element tag
	 * @param by the by condition
	 * @return the matching elements.
	 */
	public List<WebElement> findWebElements(final SeleniumTag elementTag, final By by) {
		return getHelper().findWebElements(getWebDriver(), elementTag, by);
	}

	/**
	 * @return the helper
	 */
	public HelperProvider getHelper() {
		return Helper.getProvider();
	}

	/**
	 * @return true if driver can execute javascript
	 */
	public boolean isJavascriptDriver() {
		return getWebDriver() instanceof JavascriptExecutor;
	}

	/**
	 * @param script The JavaScript to execute
	 * @see JavascriptExecutor
	 */
	public void executeJavascript(final String script) {
		if (!isJavascriptDriver()) {
			throw new IllegalStateException("Driver does not support javascript executor interface.");
		}
		JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
		jse.executeScript(script);
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
	 * Focus the current window.
	 */
	public void focusWindow() {
		executeJavascript("window.focus();");
	}

}
