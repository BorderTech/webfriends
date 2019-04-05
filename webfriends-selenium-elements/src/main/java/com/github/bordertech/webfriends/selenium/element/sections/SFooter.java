package com.github.bordertech.webfriends.selenium.element.sections;

import com.github.bordertech.webfriends.api.element.sections.HFooter;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithButtons;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithChildren;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagFooter;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium footer element.
 */
public class SFooter extends AbstractSElement implements HFooter,
		ContainerWithChildren, ContainerWithButtons {

	@Override
	public STagFooter getTagType() {
		return SeleniumTags.FOOTER;
	}

}
