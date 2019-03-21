package com.github.bordertech.webfriends.selenium.common.tag;

import com.github.bordertech.webfriends.api.common.tag.TagListContainerType;
import com.github.bordertech.webfriends.selenium.element.grouping.ListContainerElementSelenium;

/**
 * Selenium element tag.
 *
 * @param <T> the selenium heading element
 */
public interface TagListContainerTypeSelenium<T extends ListContainerElementSelenium> extends TagTypeSelenium<T>, TagListContainerType<T> {

}
