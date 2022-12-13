package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HParagraph;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagParagraph;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Selenium paragraph element.
 */
public class SParagraph extends AbstractSElement implements HParagraph, SElement {

	@Override
	public STagParagraph getTagType() {
		return SeleniumTags.P;
	}

}
