package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HHeading4;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagH4;

/**
 * Selenium H4 element.
 */
public class SHeading4 extends AbstractSElement implements HeadingElementSelenium, HHeading4 {

	@Override
	public STagH4 getTagType() {
		return SeleniumTags.H4;
	}

}
