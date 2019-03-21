package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagMenu;
import com.github.bordertech.webfriends.selenium.common.tag.TagListContainerTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.grouping.SMenu;

/**
 * HTML <code>menu</code> tag.
 */
public class STagMenu extends AbstractTag<SMenu> implements TagListContainerTypeSelenium<SMenu>, TagMenu<SMenu> {

	/**
	 * Default constructor.
	 */
	public STagMenu() {
		super(SMenu.class);
	}

}
