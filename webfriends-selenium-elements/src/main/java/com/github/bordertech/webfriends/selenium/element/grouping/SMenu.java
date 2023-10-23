package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HMenu;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagMenu;

/**
 * Menu element.
 */
public class SMenu extends AbstractListContainerElementSelenium implements HMenu {

	@Override
	public STagMenu getTagType() {
		return SeleniumTags.MENU;
	}

}
