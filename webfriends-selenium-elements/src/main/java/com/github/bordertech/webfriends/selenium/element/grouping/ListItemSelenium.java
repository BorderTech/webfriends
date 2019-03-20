package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.ListItem;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElement;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;

/**
 * Selenium list item element.
 */
public interface ListItemSelenium extends ListItem, ContainerElement {

	@Override
	public default SeleniumTag<? extends ListItemSelenium> getElementTag() {
		return SeleniumTags.LISTITEM;
	}

}
