package com.github.bordertech.webfriends.selenium.common.tag;

import com.github.bordertech.webfriends.api.common.tag.TagHeadingType;
import com.github.bordertech.webfriends.selenium.element.sections.HeadingElementSelenium;

/**
 * Selenium element tag.
 *
 * @param <T> the selenium heading element
 */
public interface TagHeadingTypeSelenium<T extends HeadingElementSelenium> extends TagTypeSelenium<T>, TagHeadingType<T> {

}
