package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HBody;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagBody;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElementSelenium;

/**
 * Selenium body element.
 */
public class SBody extends AbstractSElement implements HBody, ContainerElementSelenium {

	@Override
	public STagBody getTagType() {
		return SeleniumTags.BODY;
	}

}
