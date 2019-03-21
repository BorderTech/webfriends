package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HeadingElement;
import com.github.bordertech.webfriends.selenium.element.SElement;
import com.github.bordertech.webfriends.selenium.common.tag.TagHeadingTypeSelenium;

/**
 * Selenium heading element.
 */
public interface HeadingElementSelenium extends HeadingElement, SElement {

	@Override
	public TagHeadingTypeSelenium getTagType();

	@Override
	public default String getHeadingText() {
		return getWebElement().getText();
	}

}
