package com.github.bordertech.webfriends.selenium.common.tag;

import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartHelper;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Selenium element tag.
 *
 * @param <T> the selenium element interface
 */
public interface SeleniumTag<T extends SElement> extends ElementTag<T> {

	/**
	 * @param relative relative XPATH
	 * @return the XPATH to find selenium tag
	 */
	public default String getXPath(final boolean relative) {
		return SmartHelper.getProvider().buildElementQualifierXpath(getTagName(), getQualifiers(), relative);
	}

}
