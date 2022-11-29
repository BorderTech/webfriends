package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HStrong;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tag.TagTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Selenium strong element.
 */
public class SStrong extends AbstractSElement implements HStrong, SElement {

	@Override
	public TagTypeSelenium<? extends SStrong> getTagType() {
		return SeleniumTags.STRONG;
	}

}
