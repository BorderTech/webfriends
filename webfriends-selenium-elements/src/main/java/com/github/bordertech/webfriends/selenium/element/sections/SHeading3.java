package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HHeading3;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagH3;

/**
 * Selenium H3 element.
 */
public class SHeading3 extends AbstractSElement implements HeadingElementSelenium, HHeading3 {

	@Override
	public STagH3 getTagType() {
		return SeleniumTags.H3;
	}

}
