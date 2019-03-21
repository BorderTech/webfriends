package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.ListItemElement;
import com.github.bordertech.webfriends.selenium.common.tag.TagListItemTypeSelenium;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElementSelenium;

/**
 * Selenium list child item element.
 */
public interface ListItemElementSelenium extends ListItemElement, ContainerElementSelenium {

	@Override
	TagListItemTypeSelenium getTagType();

}
