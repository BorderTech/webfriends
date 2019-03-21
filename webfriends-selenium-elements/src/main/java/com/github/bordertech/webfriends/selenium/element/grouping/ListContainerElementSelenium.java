package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.ListContainerElement;
import com.github.bordertech.webfriends.selenium.common.tag.TagListContainerTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Selenium list container element.
 *
 * @param <T> the list item type
 */
public interface ListContainerElementSelenium<T extends ListItemElementSelenium> extends ListContainerElement<T>, SElement {

	@Override
	public TagListContainerTypeSelenium getTagType();

}
