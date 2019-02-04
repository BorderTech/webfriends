package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HHeader;
import com.github.bordertech.webfriends.selenium.capability.ContainerElement;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium header element.
 */
public class SHeader extends AbstractSElement implements HHeader, ContainerElement {

	@Override
	public SeleniumTag<? extends SHeader> getElementTag() {
		return SeleniumTags.HEADER;
	}

	@Override
	public String getHeaderText() {
		HeadingElementSelenium heading = getHelper().findHeading(getDriver(), getWebElement());
		return heading == null ? null : heading.getHeadingText();
	}

}
