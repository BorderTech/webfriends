package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagHtml;
import com.github.bordertech.webfriends.selenium.element.document.SHtmlRoot;

/**
 * HTML <code>html</code> tag.
 */
public class STagHtml extends AbstractTag<SHtmlRoot> implements TagHtml<SHtmlRoot> {

	/**
	 * Default constructor.
	 */
	public STagHtml() {
		super(SHtmlRoot.class);
	}

}
