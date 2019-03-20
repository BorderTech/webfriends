package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HeadingElement;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Selenium heading element.
 */
public interface HeadingElementSelenium extends HeadingElement, SElement {

	@Override
	public SeleniumTag<? extends HeadingElementSelenium> getElementTag();

	@Override
	public default String getHeadingText() {
		return getWebElement().getText();
	}

}
