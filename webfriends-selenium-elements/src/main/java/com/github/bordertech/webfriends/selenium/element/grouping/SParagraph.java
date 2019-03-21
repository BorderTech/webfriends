package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HParagraph;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.element.SElement;
import com.github.bordertech.webfriends.selenium.common.tag.TagTypeSelenium;

/**
 * Selenium paragraph element.
 */
public class SParagraph extends AbstractSElement implements HParagraph, SElement {

	@Override
	public TagTypeSelenium<? extends SParagraph> getTagType() {
		return SeleniumTags.P;
	}

}
