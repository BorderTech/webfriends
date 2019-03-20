package com.github.bordertech.webfriends.selenium.common.tag;

import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.Qualifier;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartHelper;
import com.github.bordertech.webfriends.selenium.element.SElement;
import java.util.List;

/**
 * Selenium element tag.
 *
 * @param <T> the selenium element type
 */
public class SeleniumDefaultTag<T extends SElement> implements SeleniumTag<T> {

	private final Class<T> tagClass;
	private final ElementTag backing;
	private final String xpathRoot;
	private final String xpathRelative;

	/**
	 * @param tagClass the selenium element tag class
	 * @param backing the backing tag
	 */
	public SeleniumDefaultTag(final Class<T> tagClass, final ElementTag backing) {
		this.tagClass = tagClass;
		this.backing = backing;
		this.xpathRoot = SmartHelper.getProvider().buildElementQualifierXpath(backing.getTagName(), backing.getQualifiers(), false);
		this.xpathRelative = SmartHelper.getProvider().buildElementQualifierXpath(backing.getTagName(), backing.getQualifiers(), true);
	}

	@Override
	public Class<T> getTagClass() {
		return tagClass;
	}

	@Override
	public String getTagName() {
		return backing.getTagName();
	}

	@Override
	public List<Qualifier> getQualifiers() {
		return backing.getQualifiers();
	}

	@Override
	public String getXPath(final boolean relative) {
		return relative ? xpathRelative : xpathRoot;
	}

}
