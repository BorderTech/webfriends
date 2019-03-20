package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HMenuItem;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium menu item element.
 */
public class SMenuItem extends AbstractSElement implements HMenuItem, ListItemSelenium {

	@Override
	public String getMenuItemText() {
		return getWebElement().getText();
	}

}
