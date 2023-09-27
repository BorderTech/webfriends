package com.github.bordertech.webfriends.selenium.common.tag;

import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.selenium.element.SElement;
import com.github.bordertech.webfriends.selenium.smart.driver.ElementUtil;

/**
 * Selenium element tag.
 *
 * @param <T> the selenium element
 */
public interface TagTypeSelenium<T extends SElement> extends TagType<T> {

	/**
	 * @param relative relative XPATH
	 * @return the XPATH to find selenium tag
	 */
	default String getXPath(final boolean relative) {
		return ElementUtil.buildElementQualifierXpath(getTagName(), getQualifiers(), relative);
	}

}
