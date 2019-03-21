package com.github.bordertech.webfriends.selenium.element.textlevel;

import com.github.bordertech.webfriends.api.element.textlevel.HSpan;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagSpan;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElementSelenium;

/**
 * Selenium span element.
 */
public class SSpan extends AbstractSElement implements HSpan, ContainerElementSelenium {

	@Override
	public STagSpan getTagType() {
		return SeleniumTags.SPAN;
	}

}
