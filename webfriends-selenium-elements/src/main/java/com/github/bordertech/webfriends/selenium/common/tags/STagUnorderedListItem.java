package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.selenium.common.tag.TagListItemTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.grouping.SUnorderedListItem;
import com.github.bordertech.webfriends.api.common.tags.TagUnorderedListItem;

/**
 * HTML <code>li</code> list item tag.
 */
public class STagUnorderedListItem extends AbstractTag<SUnorderedListItem> implements TagListItemTypeSelenium<SUnorderedListItem>, TagUnorderedListItem<SUnorderedListItem> {

	/**
	 * Default constructor.
	 */
	public STagUnorderedListItem() {
		super(SUnorderedListItem.class);
	}

}
