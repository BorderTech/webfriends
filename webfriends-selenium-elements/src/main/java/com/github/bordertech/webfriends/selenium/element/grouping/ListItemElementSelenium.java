package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.ListItemElement;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithButtons;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithChildren;
import com.github.bordertech.webfriends.selenium.common.tag.TagListItemTypeSelenium;

/**
 * Selenium list child item element.
 */
public interface ListItemElementSelenium extends ListItemElement,
		ContainerWithChildren, ContainerWithButtons {

	@Override
	TagListItemTypeSelenium getTagType();

}
