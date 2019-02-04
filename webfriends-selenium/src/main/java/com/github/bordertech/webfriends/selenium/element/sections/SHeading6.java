package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HHeading6;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium H6 element.
 */
public class SHeading6 extends AbstractSElement implements HeadingElementSelenium, HHeading6 {

	@Override
	public SeleniumTag<? extends SHeading6> getElementTag() {
		return SeleniumTags.H6;
	}

}
