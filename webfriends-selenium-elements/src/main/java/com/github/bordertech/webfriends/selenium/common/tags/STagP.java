package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagP;
import com.github.bordertech.webfriends.selenium.element.grouping.SParagraph;

/**
 * HTML <code>p</code> paragraph tag.
 */
public class STagP extends AbstractTag<SParagraph> implements TagP<SParagraph> {

	/**
	 * Default constructor.
	 */
	public STagP() {
		super(SParagraph.class);
	}

}
