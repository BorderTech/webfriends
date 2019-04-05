package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HHeader;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithButtons;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithChildren;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagHeader;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium header element.
 */
public class SHeader extends AbstractSElement implements HHeader,
		ContainerWithChildren, ContainerWithButtons {

	@Override
	public STagHeader getTagType() {
		return SeleniumTags.HEADER;
	}

	@Override
	public String getHeaderText() {
		HeadingElementSelenium heading = getHelper().findHeading(getDriver(), getWebElement());
		return heading == null ? null : heading.getHeadingText();
	}

}
