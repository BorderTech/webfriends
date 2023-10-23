package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.ListContainerElement;
import com.github.bordertech.webfriends.selenium.common.tag.TagListContainerTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Selenium list container element.
 */
public interface ListContainerElementSelenium extends ListContainerElement, SElement {

	@Override
	TagListContainerTypeSelenium getTagType();

}
