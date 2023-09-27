package com.github.bordertech.webfriends.selenium.util.driver;

import com.github.bordertech.didums.Didums;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	 * Verify the correct page has been loaded.
	 *
	 * @param condition the page verify condition
	 */
	public void verifyPageCondition(final Function<WebDriver, Boolean> condition) {
		// Check page is ready before verifying page
		waitForPageReady();
		if (condition != null) {
			int timeout = ConfigUtilProperties.getVerifyPageTimeout();
			long polling = ConfigUtilProperties.getVerifyPagePollInterval();
			waitForCondition(timeout, polling, condition);
		}
	}

	/**
	 * Wait for the page to have loaded, including all AJAX and JavaScript. Uses default values for timeout and polling
	 * interval.
	 */
	public void waitForPageReady() {
		Function<WebDriver, Boolean> condition = getPageReadyCondition();
		if (condition != null) {
			int timeout = ConfigUtilProperties.getPageReadyTimeout();
			long polling = ConfigUtilProperties.getPageReadyPollInterval();
			waitForCondition(timeout, polling, condition);
		}
	}

	/**
	 * Wait for the condition to be true.
	 *
	 * @param timeoutSeconds - the number of seconds after which the 'wait' will time out
	 * @param pollingMilliseconds - the number of milliseconds to wait between each poll attempt
	 * @param condition the expected condition
	 */
	public void waitForCondition(final int timeoutSeconds, final long pollingMilliseconds, final Function<WebDriver, Boolean> condition) {
		if (condition == null) {
			throw new IllegalArgumentException("A condition must be provided.");
		}
		WebDriverWait wait = new WebDriverWait(getWebDriver(), Duration.ofSeconds(timeoutSeconds), Duration.ofMillis(pollingMilliseconds));
		wait.until(condition);
	}

	/**
	 * Get the page ready condition.
	 *
	 * @return the condition for page ready, or null for no condition
	 */
	public PageReadyCondition getPageReadyCondition() {
		if (Didums.hasService(PageReadyCondition.class)) {
			return Didums.getService(PageReadyCondition.class);
		}
		return null;
	}

	/**
	 * Configure the web driver with the standard configuration.
	 */
	public void configDriver() {
		configWait();
		int width = ConfigUtilProperties.getScreenWidth();
		int height = ConfigUtilProperties.getScreenHeight();
		getWebDriver().manage().window().setSize(new Dimension(width, height));
	}

	/**
	 * Configure the default web driver implicit wait.
	 */
	public void configWait() {
		long seconds = ConfigUtilProperties.getImplicitWait();
		setImplicitWait(seconds, TimeUnit.SECONDS);
	}

	/**
	 * Configure the web driver implicit wait for immediate find (ie no wait).
	 */
	public void configNoWait() {
		setImplicitWait(0, TimeUnit.MILLISECONDS);
	}

	/**
	 * Configure the web driver implicit wait.
	 *
	 * @param time the amount of time to wait.
	 * @param unit the unit of measure for {@code time}.
	 */
	public void setImplicitWait(final long time, final TimeUnit unit) {
		getWebDriver().manage().timeouts().implicitlyWait(time, unit);
	}

	/**
	 * Wait for the AJAX to complete.
	 */
	public void waitForAjaxReady() {
		waitForPageReady();
	}

	/**
	 * Set focus to this element.
	 *
	 * @param webElement the web element to focus
	 */
	public void setFocus(final WebElement webElement) {
		// Get element ID
		String id = webElement.getAttribute("id");
		if (StringUtils.isEmpty(id)) {
			return;
		}
		// Build script
		StringBuilder script = new StringBuilder("window.focus(); document.getElementById('");
		script.append(id);
		script.append("').focus();");
		// Execute script
		executeJavascript(script.toString());
	}

}
