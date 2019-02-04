package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HDiv;
import com.github.bordertech.webfriends.selenium.capability.ContainerElement;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium div element.
 */
public class SDiv extends AbstractSElement implements HDiv, ContainerElement {

	@Override
	public SeleniumTag<? extends SDiv> getElementTag() {
		return SeleniumTags.DIV;
	}

}
