package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagUL;
import com.github.bordertech.webfriends.selenium.common.tag.TagListContainerTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.grouping.SUnorderedList;

/**
 * HTML <code>ul</code> unordered tag.
 */
public class STagUL extends AbstractTag<SUnorderedList> implements TagListContainerTypeSelenium<SUnorderedList>, TagUL<SUnorderedList> {

	/**
	 * Default constructor.
	 */
	public STagUL() {
		super(SUnorderedList.class);
	}

}
