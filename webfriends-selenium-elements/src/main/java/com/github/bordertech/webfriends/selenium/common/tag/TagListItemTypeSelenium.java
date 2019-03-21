package com.github.bordertech.webfriends.selenium.common.tag;

import com.github.bordertech.webfriends.api.common.tag.TagListItemType;
import com.github.bordertech.webfriends.selenium.element.grouping.ListItemElementSelenium;

/**
 * Selenium element tag.
 *
 * @param <T> the selenium list item element
 */
public interface TagListItemTypeSelenium<T extends ListItemElementSelenium> extends TagTypeSelenium<T>, TagListItemType<T> {

}
