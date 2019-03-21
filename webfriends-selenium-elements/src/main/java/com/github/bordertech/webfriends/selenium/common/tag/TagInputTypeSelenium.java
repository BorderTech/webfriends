package com.github.bordertech.webfriends.selenium.common.tag;

import com.github.bordertech.webfriends.api.common.tag.TagInputType;
import com.github.bordertech.webfriends.selenium.element.form.input.InputElementSelenium;

/**
 * Selenium input element tag.
 *
 * @param <T> the selenium input element
 */
public interface TagInputTypeSelenium<T extends InputElementSelenium> extends TagTypeSelenium<T>, TagInputType<T> {

}
