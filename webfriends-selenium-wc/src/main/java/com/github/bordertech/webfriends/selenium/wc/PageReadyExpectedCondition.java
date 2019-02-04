package com.github.bordertech.webfriends.selenium.wc;

import com.github.bordertech.webfriends.selenium.util.condition.PageReadyCondition;
import com.github.bordertech.webfriends.selenium.util.config.ConfigurationProperties;
import org.apache.commons.lang3.BooleanUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * WComponents page ready condition.
 */
public class PageReadyExpectedCondition implements PageReadyCondition {

	/**
	 * The body tag indicating the page is ready.
	 */
	private static final String DATA_READY_TAG = ConfigurationProperties.getDataReadyTag();

	/**
	 * Wait for the WComponents page to be ready.
	 *
	 * @param driver - the web driver
	 * @return true when the page is ready, false otherwise.
	 */
	@Override
	public Boolean apply(final WebDriver driver) {

		if (driver == null) {
			throw new IllegalArgumentException("A driver must be provided.");
		}

		boolean domReady;
		try {
			WebElement body = driver.findElement(By.tagName("body"));
			String domReadyAttr = body.getAttribute(DATA_READY_TAG);
			// If value is 'true' or the tag does not exist, the dom is ready.
			// The tag will only not exist if there has been an error, and the page is not actual WComponents.
			domReady = BooleanUtils.isNotFalse(BooleanUtils.toBooleanObject(domReadyAttr));
		} catch (final StaleElementReferenceException e) {
			// It's possible the test got in too quick between loads.
			// The element is stale if the page has been reloaded
			// Run the test again with the new page.
			domReady = false;
		}

		return domReady;

	}
}
