package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HListItem;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagLI;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium list item element.
 */
public class SListItem extends AbstractSElement implements HListItem {

	@Override
	public STagLI getTagType() {
		return SeleniumTags.LI;
	}

	@Override
	public int getOrdinalValue() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
