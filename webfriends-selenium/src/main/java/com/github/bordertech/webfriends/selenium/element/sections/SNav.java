package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HNav;
import com.github.bordertech.webfriends.selenium.capability.ContainerElement;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium nav element.
 */
public class SNav extends AbstractSElement implements HNav, ContainerElement {

	@Override
	public SeleniumTag<? extends SNav> getElementTag() {
		return SeleniumTags.NAV;
	}

	@Override
	public String getSectionTitle() {
		HeadingElementSelenium heading = getHelper().findHeading(getDriver(), getWebElement());
		return heading == null ? null : heading.getHeadingText();
	}

}
