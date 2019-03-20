package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HFooter;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElement;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium footer element.
 */
public class SFooter extends AbstractSElement implements HFooter, ContainerElement {

	@Override
	public SeleniumTag<? extends SFooter> getElementTag() {
		return SeleniumTags.FOOTER;
	}

}