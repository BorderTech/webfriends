package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HDiv;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagDiv;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElementSelenium;

/**
 * Selenium div element.
 */
public class SDiv extends AbstractSElement implements HDiv, ContainerElementSelenium {

	@Override
	public STagDiv getTagType() {
		return SeleniumTags.DIV;
	}

}
