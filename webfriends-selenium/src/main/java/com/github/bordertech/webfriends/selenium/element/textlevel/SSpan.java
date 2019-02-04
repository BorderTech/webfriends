package com.github.bordertech.webfriends.selenium.element.textlevel;

import com.github.bordertech.webfriends.api.element.textlevel.HSpan;
import com.github.bordertech.webfriends.selenium.capability.ContainerElement;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium span element.
 */
public class SSpan extends AbstractSElement implements HSpan, ContainerElement {

	@Override
	public SeleniumTag<? extends SSpan> getElementTag() {
		return SeleniumTags.SPAN;
	}

}
