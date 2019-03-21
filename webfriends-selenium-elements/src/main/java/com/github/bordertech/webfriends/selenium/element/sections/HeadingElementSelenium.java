package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HeadingElement;
import com.github.bordertech.webfriends.selenium.common.tag.TagHeadingTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Selenium heading element.
 */
public interface HeadingElementSelenium extends HeadingElement, SElement {

	@Override
	TagHeadingTypeSelenium getTagType();

	@Override
	default String getHeadingText() {
		return getWebElement().getText();
	}

}
