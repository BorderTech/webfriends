package com.github.bordertech.webfriends.selenium.common.tag;

import com.github.bordertech.webfriends.api.common.tag.TagMediaType;
import com.github.bordertech.webfriends.selenium.element.embedded.MediaElementSelenium;

/**
 * Selenium media element tag.
 *
 * @param <T> the selenium media element
 */
public interface TagMediaTypeSelenium<T extends MediaElementSelenium> extends TagTypeSelenium<T>, TagMediaType<T> {

}
