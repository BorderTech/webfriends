package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagSummary;
import com.github.bordertech.webfriends.selenium.element.interactive.SSummary;

/**
 * HTML <code>summary</code> tag.
 */
public class STagSummary extends AbstractTag<SSummary> implements TagSummary<SSummary> {

	/**
	 * Default constructor.
	 */
	public STagSummary() {
		super(SSummary.class);
	}

}
