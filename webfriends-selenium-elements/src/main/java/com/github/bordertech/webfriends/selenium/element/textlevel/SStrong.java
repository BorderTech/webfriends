package com.github.bordertech.webfriends.selenium.element.textlevel;

import com.github.bordertech.webfriends.api.element.textlevel.HStrong;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagStrong;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Selenium strong element.
 */
public class SStrong extends AbstractSElement implements HStrong, SElement {

	@Override
	public STagStrong getTagType() {
		return SeleniumTags.STRONG;
	}

}
