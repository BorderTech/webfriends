package com.github.bordertech.webfriends.selenium.util.driver;

import java.util.function.Function;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

/**
 * Friend driver that wraps the selenium web driver.
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
		throw new WebDriverException("Driver does not support task sreen shot.");
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
	 * Focus the current window.
	 */
	public void focusWindow() {
		executeJavascript("window.focus();");
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
	 * @return the driver helper
	 */
	public HelperProvider getHelper() {
		return Helper.getProvider();
	}

}
