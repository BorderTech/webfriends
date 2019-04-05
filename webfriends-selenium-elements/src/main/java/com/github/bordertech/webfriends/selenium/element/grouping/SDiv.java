package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HDiv;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithButtons;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithChildren;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagDiv;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium div element.
 */
public class SDiv extends AbstractSElement implements HDiv,
		ContainerWithChildren, ContainerWithButtons {

	@Override
	public STagDiv getTagType() {
		return SeleniumTags.DIV;
	}

}
