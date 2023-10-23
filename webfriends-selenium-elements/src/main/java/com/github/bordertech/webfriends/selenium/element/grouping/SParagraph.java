package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HParagraph;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagP;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Selenium paragraph element.
 */
public class SParagraph extends AbstractSElement implements HParagraph, SElement {

	@Override
	public STagP getTagType() {
		return SeleniumTags.P;
	}

}
