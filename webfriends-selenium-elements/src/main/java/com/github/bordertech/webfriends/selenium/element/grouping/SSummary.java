package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HSummary;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithButtons;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithChildren;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagSummary;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium summary element.
 */
public class SSummary extends AbstractSElement implements HSummary,
		ContainerWithChildren, ContainerWithButtons {

	@Override
	public STagSummary getTagType() {
		return SeleniumTags.SUMMARY;
	}

}
