package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagSpan;
import com.github.bordertech.webfriends.selenium.element.textlevel.SSpan;

/**
 * HTML <code>span</code> tag.
 */
public class STagSpan extends AbstractTag<SSpan> implements TagSpan<SSpan> {

	/**
	 * Default constructor.
	 */
	public STagSpan() {
		super(SSpan.class);
	}

}
