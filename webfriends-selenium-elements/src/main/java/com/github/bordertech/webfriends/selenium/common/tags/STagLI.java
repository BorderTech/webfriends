package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagLI;
import com.github.bordertech.webfriends.selenium.element.grouping.SListItem;

/**
 * HTML <code>li</code> list item tag.
 */
public class STagLI extends AbstractTag<SListItem> implements TagLI<SListItem> {

	/**
	 * Default constructor.
	 */
	public STagLI() {
		super(SListItem.class);
	}

}
