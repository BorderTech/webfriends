package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagHeader;
import com.github.bordertech.webfriends.selenium.element.sections.SHeader;

/**
 * HTML <code>header</code> tag.
 */
public class STagHeader extends AbstractTag<SHeader> implements TagHeader<SHeader> {

	/**
	 * Default constructor.
	 */
	public STagHeader() {
		super(SHeader.class);
	}

}
