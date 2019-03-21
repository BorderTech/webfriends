package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.api.element.form.input.InputElement;
import com.github.bordertech.webfriends.selenium.common.form.control.FormControlSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.TagInputTypeSelenium;

/**
 * Selenium input element.
 */
public interface InputElementSelenium extends InputElement, FormControlSelenium {

	@Override
	TagInputTypeSelenium getTagType();

}
