package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HMenu;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import java.util.List;

/**
 * Menu element.
 */
public class SMenu extends AbstractSElement implements HMenu<SMenuItem>, ListElementSelenium<SMenuItem> {

	@Override
	public SeleniumTag<? extends SMenu> getElementTag() {
		return SeleniumTags.MENU;
	}

	@Override
	public SMenuItem getMenuItemByText(final String text) {
		throw new UnsupportedOperationException("No supported yet.");
	}

	@Override
	public List<SMenuItem> getListItems() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}