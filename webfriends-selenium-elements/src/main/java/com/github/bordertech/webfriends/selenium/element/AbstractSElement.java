package com.github.bordertech.webfriends.selenium.element;

import com.github.bordertech.webfriends.selenium.smart.driver.ElementUtil;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriver;
import org.openqa.selenium.WebElement;

/**
 * Default Selenium Element.
 */
public abstract class AbstractSElement implements SElement {

	private SmartDriver driver;
	private WebElement webElement;

	/**
	 * Default constructor. Must use initElement to set backing driver and element.
	 */
	public AbstractSElement() {
		this.driver = null;
		this.webElement = null;
	}

	/**
	 * @param driver the backing web driver
	 * @param webElement the backing web element
	 */
	public AbstractSElement(final SmartDriver driver, final WebElement webElement) {
		this.driver = driver;
		this.webElement = webElement;
		checkElement();
	}

	@Override
	public void initElement(final SmartDriver driver, final WebElement webElement) {
		this.driver = driver;
		this.webElement = webElement;
		checkElement();
	}

	@Override
	public WebElement getWebElement() {
		return webElement;
	}

	@Override
	public SmartDriver getDriver() {
		return driver;
	}

	protected final void checkElement() {
		if (getWebElement() == null) {
			throw new IllegalArgumentException("Backing web element must be provided.");
		}
		if (getDriver() == null) {
			throw new IllegalArgumentException("Backing web driver must be provided.");
		}
		// Check element and TAG are a match
		if (!ElementUtil.isElementMatch(getWebElement(), getTagType())) {
			String name = getWebElement().getTagName();
			String expected = getTagType().getKey();
			throw new IllegalStateException("Web element is [" + name + "] but expected [" + expected + "].");
		}
	}

}
