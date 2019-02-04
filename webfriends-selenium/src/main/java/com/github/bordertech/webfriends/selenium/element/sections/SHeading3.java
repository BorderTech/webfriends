package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HHeading3;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium H3 element.
 */
public class SHeading3 extends AbstractSElement implements HeadingElementSelenium, HHeading3 {

	@Override
	public SeleniumTag<? extends SHeading3> getElementTag() {
		return SeleniumTags.H3;
	}

}
