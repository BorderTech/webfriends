package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagA;
import com.github.bordertech.webfriends.selenium.element.textlevel.SLinkAnchor;

/**
 * HTML <code>a</code> tag.
 */
public class STagA extends AbstractTag<SLinkAnchor> implements TagA<SLinkAnchor> {

	/**
	 * Default constructor.
	 */
	public STagA() {
		super(SLinkAnchor.class);
	}

}
