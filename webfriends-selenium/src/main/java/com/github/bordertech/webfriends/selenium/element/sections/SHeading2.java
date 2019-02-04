package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HHeading2;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium H2 element.
 */
public class SHeading2 extends AbstractSElement implements HeadingElementSelenium, HHeading2 {

	@Override
	public SeleniumTag<? extends SHeading2> getElementTag() {
		return SeleniumTags.H2;
	}

}
