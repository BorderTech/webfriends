package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HUnorderedListItem;
import com.github.bordertech.webfriends.selenium.common.tags.STagUnorderedListItem;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium list item element.
 */
public class SUnorderedListItem extends AbstractSElement implements HUnorderedListItem, ListItemElementSelenium {

	@Override
	public STagUnorderedListItem getTagType() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
