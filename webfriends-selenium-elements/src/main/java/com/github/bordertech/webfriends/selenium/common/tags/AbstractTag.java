package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.selenium.common.tag.TagTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.SElement;
import com.github.bordertech.webfriends.selenium.smart.driver.ElementUtil;

/**
 * Selenium element tag.
 *
 * @param <T> the selenium element type
 */
public abstract class AbstractTag<T extends SElement> implements TagTypeSelenium<T> {

	private final Class<T> elementClass;
	private String xpathRoot;
	private String xpathRelative;

	/**
	 * @param elementClass the selenium element tag class
	 */
	public AbstractTag(final Class<T> elementClass) {
		this.elementClass = elementClass;
	}

	@Override
	public Class<T> getElementClass() {
		return elementClass;
	}

	@Override
	public String getXPath(final boolean relative) {
		return relative ? getXPathRelative() : getXPathRoot();
	}

	/**
	 * @return the relative XPATH to find element
	 */
	protected String getXPathRelative() {
		if (xpathRelative == null) {
			xpathRelative = ElementUtil.buildElementQualifierXpath(getTagName(), getQualifiers(), true);
		}
		return xpathRelative;
	}

	/**
	 * @return the root XPATH to find element
	 */
	protected String getXPathRoot() {
		if (xpathRoot == null) {
			xpathRoot = ElementUtil.buildElementQualifierXpath(getTagName(), getQualifiers(), false);
		}
		return xpathRoot;
	}

}
