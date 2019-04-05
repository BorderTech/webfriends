package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HSection;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithButtons;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithChildren;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagSection;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium section element.
 */
public class SSection extends AbstractSElement implements HSection,
		ContainerWithChildren, ContainerWithButtons {

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
