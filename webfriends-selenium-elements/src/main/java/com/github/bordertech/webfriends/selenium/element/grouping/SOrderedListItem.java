package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HOrderedListItem;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium ordered list item element.
 */
public class SOrderedListItem extends AbstractSElement implements HOrderedListItem, ListItemSelenium {

	@Override
	public int getOrdinalValue() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
