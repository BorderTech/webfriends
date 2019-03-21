package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagMenuItem;
import com.github.bordertech.webfriends.selenium.common.tag.TagListItemTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.grouping.SMenuItem;

/**
 * HTML <code>li</code> menu item tag.
 */
public class STagMenuItem extends AbstractTag<SMenuItem> implements TagListItemTypeSelenium<SMenuItem>, TagMenuItem<SMenuItem> {

	/**
	 * Default constructor.
	 */
	public STagMenuItem() {
		super(SMenuItem.class);
	}

}
