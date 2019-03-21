package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.selenium.element.sections.HeadingElementSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.TagHeadingTypeSelenium;

/**
 * Selenium heading element tag.
 *
 * @param <T> the selenium element type
 */
public abstract class AbstractHeadingTag<T extends HeadingElementSelenium> extends AbstractTag<T> implements TagHeadingTypeSelenium<T> {

	/**
	 * @param elementClass the selenium element tag class
	 */
	public AbstractHeadingTag(final Class<T> elementClass) {
		super(elementClass);
	}

}
