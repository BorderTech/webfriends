package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagDiv;
import com.github.bordertech.webfriends.selenium.element.grouping.SDiv;

/**
 * HTML <code>div</code> tag.
 */
public class STagDiv extends AbstractTag<SDiv> implements TagDiv<SDiv> {

	/**
	 * Default constructor.
	 */
	public STagDiv() {
		super(SDiv.class);
	}

}
