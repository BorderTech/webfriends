package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HNav;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithButtons;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithChildren;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagNav;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium nav element.
 */
public class SNav extends AbstractSElement implements HNav,
		ContainerWithChildren, ContainerWithButtons {

	@Override
	public STagNav getTagType() {
		return SeleniumTags.NAV;
	}

	@Override
	public String getSectionTitle() {
		HeadingElementSelenium heading = getHelper().findHeading(getDriver(), getWebElement());
		return heading == null ? null : heading.getHeadingText();
	}

}
