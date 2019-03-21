package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagParagraph;
import com.github.bordertech.webfriends.selenium.element.grouping.SParagraph;

/**
 * HTML <code>p</code> tag.
 */
public class STagParagraph extends AbstractTag<SParagraph> implements TagParagraph<SParagraph> {

	/**
	 * Default constructor.
	 */
	public STagParagraph() {
		super(SParagraph.class);
	}

}
