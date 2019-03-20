package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HBody;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElement;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium body element.
 */
public class SBody extends AbstractSElement implements HBody, ContainerElement {

	@Override
	public SeleniumTag<? extends SBody> getElementTag() {
		return SeleniumTags.BODY;
	}

}
