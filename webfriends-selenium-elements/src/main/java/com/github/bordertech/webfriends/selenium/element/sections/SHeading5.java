package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HHeading5;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagH5;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium H5 element.
 */
public class SHeading5 extends AbstractSElement implements HeadingElementSelenium, HHeading5 {

	@Override
	public STagH5 getTagType() {
		return SeleniumTags.H5;
	}

}
