package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.selenium.common.tag.TagListContainerTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.grouping.SOrderedList;
import com.github.bordertech.webfriends.api.common.tags.TagOL;

/**
 * HTML <code>ol</code> ordered list tag.
 */
public class STagOL extends AbstractTag<SOrderedList> implements TagListContainerTypeSelenium<SOrderedList>, TagOL<SOrderedList> {

	/**
	 * Default constructor.
	 */
	public STagOL() {
		super(SOrderedList.class);
	}

}
