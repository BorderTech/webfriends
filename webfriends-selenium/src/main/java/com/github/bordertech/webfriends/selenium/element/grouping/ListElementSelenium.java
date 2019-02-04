package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.ListElement;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Selenium list element.
 *
 * @param <T> the list item type
 */
public interface ListElementSelenium<T extends ListItemSelenium> extends ListElement<T>, SElement {

	@Override
	public SeleniumTag<? extends ListElementSelenium> getElementTag();

}
