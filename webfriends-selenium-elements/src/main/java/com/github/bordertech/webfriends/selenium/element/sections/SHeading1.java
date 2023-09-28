package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HHeading1;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagH1;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium H1 element.
 */
public class SHeading1 extends AbstractSElement implements HeadingElementSelenium, HHeading1 {

	@Override
	public STagH1 getTagType() {
		return SeleniumTags.H1;
	}

}
