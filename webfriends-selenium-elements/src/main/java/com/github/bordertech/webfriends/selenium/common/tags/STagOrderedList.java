package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.selenium.element.grouping.SOrderedList;
import com.github.bordertech.webfriends.api.common.tags.TagOrderedList;
import com.github.bordertech.webfriends.selenium.common.tag.TagListContainerTypeSelenium;

/**
 * HTML <code>ol</code> ordered list tag.
 */
public class STagOrderedList extends AbstractTag<SOrderedList> implements TagListContainerTypeSelenium<SOrderedList>, TagOrderedList<SOrderedList> {

	/**
	 * Default constructor.
	 */
	public STagOrderedList() {
		super(SOrderedList.class);
	}

}
