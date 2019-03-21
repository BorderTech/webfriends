package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagOrderedListItem;
import com.github.bordertech.webfriends.selenium.common.tag.TagListItemTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.grouping.SOrderedListItem;

/**
 * HTML <code>it</code> ordered list item tag.
 */
public class STagOrderedListItem extends AbstractTag<SOrderedListItem> implements TagListItemTypeSelenium<SOrderedListItem>, TagOrderedListItem<SOrderedListItem> {

	/**
	 * Default constructor.
	 */
	public STagOrderedListItem() {
		super(SOrderedListItem.class);
	}

}
