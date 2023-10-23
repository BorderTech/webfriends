package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HUnorderedList;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagUL;

/**
 * Selenium list (unordered) element.
 */
public class SUnorderedList extends AbstractListContainerElementSelenium implements HUnorderedList {

	@Override
	public STagUL getTagType() {
		return SeleniumTags.UL;
	}

}
