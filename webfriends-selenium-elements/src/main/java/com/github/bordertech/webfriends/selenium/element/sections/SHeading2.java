package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HHeading2;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagH2;

/**
 * Selenium H2 element.
 */
public class SHeading2 extends AbstractSElement implements HeadingElementSelenium, HHeading2 {

	@Override
	public STagH2 getTagType() {
		return SeleniumTags.H2;
	}

}
