package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagStrong;
import com.github.bordertech.webfriends.selenium.element.grouping.SStrong;

/**
 * HTML <code>strong</code> tag.
 */
public class STagStrong extends AbstractTag<SStrong> implements TagStrong<SStrong> {

	/**
	 * Default constructor.
	 */
	public STagStrong() {
		super(SStrong.class);
	}

}
