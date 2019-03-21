package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagHead;
import com.github.bordertech.webfriends.selenium.element.metadata.SHead;

/**
 * HTML <code>head</code> tag.
 */
public class STagHead extends AbstractTag<SHead> implements TagHead<SHead> {

	/**
	 * Default constructor.
	 */
	public STagHead() {
		super(SHead.class);
	}

}
