package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.selenium.element.grouping.SUnorderedList;
import com.github.bordertech.webfriends.api.common.tags.TagUnorderedList;
import com.github.bordertech.webfriends.selenium.common.tag.TagListContainerTypeSelenium;

/**
 * HTML <code>ul</code> tag.
 */
public class STagUnorderedList extends AbstractTag<SUnorderedList> implements TagListContainerTypeSelenium<SUnorderedList>, TagUnorderedList<SUnorderedList> {

	/**
	 * Default constructor.
	 */
	public STagUnorderedList() {
		super(SUnorderedList.class);
	}

}
