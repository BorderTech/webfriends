package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HSection;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagSection;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElementSelenium;

/**
 * Selenium section element.
 */
public class SSection extends AbstractSElement implements HSection, ContainerElementSelenium {

	@Override
	public STagSection getTagType() {
		return SeleniumTags.SECTION;
	}

	@Override
	public String getSectionTitle() {
		HeadingElementSelenium heading = getHelper().findHeading(getDriver(), getWebElement());
		return heading == null ? null : heading.getHeadingText();
	}

}
