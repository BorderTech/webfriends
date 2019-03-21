package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HFooter;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagFooter;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElementSelenium;

/**
 * Selenium footer element.
 */
public class SFooter extends AbstractSElement implements HFooter, ContainerElementSelenium {

	@Override
	public STagFooter getTagType() {
		return SeleniumTags.FOOTER;
	}

}
