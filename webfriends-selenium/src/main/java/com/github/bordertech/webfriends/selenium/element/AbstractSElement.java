package com.github.bordertech.webfriends.selenium.element;

import com.github.bordertech.webfriends.selenium.util.driver.FriendDriver;
import org.openqa.selenium.WebElement;

/**
 * Default Selenium Element.
 */
public abstract class AbstractSElement implements SElement {

	private FriendDriver driver;
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
	public AbstractSElement(final FriendDriver driver, final WebElement webElement) {
		this.driver = driver;
		this.webElement = webElement;
		checkElement();
	}

	@Override
	public void initElement(final FriendDriver driver, final WebElement webElement) {
		this.driver = driver;
		this.webElement = webElement;
		checkElement();
	}

	@Override
	public WebElement getWebElement() {
		return webElement;
	}

	@Override
	public FriendDriver getDriver() {
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
		if (!getHelper().isElementMatch(getWebElement(), getElementTag())) {
			String name = getWebElement().getTagName();
			String expected = getElementTag().getKey();
			throw new IllegalStateException("Web element is [" + name + "] but expected [" + expected + "].");
		}
	}

}
