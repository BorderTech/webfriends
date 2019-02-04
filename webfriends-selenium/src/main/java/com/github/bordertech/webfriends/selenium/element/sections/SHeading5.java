package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HHeading5;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium H5 element.
 */
public class SHeading5 extends AbstractSElement implements HeadingElementSelenium, HHeading5 {

	@Override
	public SeleniumTag<? extends SHeading5> getElementTag() {
		return SeleniumTags.H5;
	}

}
