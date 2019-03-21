package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.selenium.element.form.input.InputElementSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.TagInputTypeSelenium;

/**
 * Selenium element tag.
 *
 * @param <T> the selenium element type
 */
public abstract class AbstractInputTag<T extends InputElementSelenium> extends AbstractTag<T> implements TagInputTypeSelenium<T> {

	/**
	 * @param elementClass the selenium element tag class
	 */
	public AbstractInputTag(final Class<T> elementClass) {
		super(elementClass);
	}

}
