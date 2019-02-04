package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HHeading4;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium H4 element.
 */
public class SHeading4 extends AbstractSElement implements HeadingElementSelenium, HHeading4 {

	@Override
	public SeleniumTag<? extends SHeading4> getElementTag() {
		return SeleniumTags.H4;
	}

}
