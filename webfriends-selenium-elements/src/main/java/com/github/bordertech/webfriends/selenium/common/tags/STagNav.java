package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagNav;
import com.github.bordertech.webfriends.selenium.element.sections.SNav;

/**
 * HTML <code>nav</code> tag.
 */
public class STagNav extends AbstractTag<SNav> implements TagNav<SNav> {

	/**
	 * Default constructor.
	 */
	public STagNav() {
		super(SNav.class);
	}

}
