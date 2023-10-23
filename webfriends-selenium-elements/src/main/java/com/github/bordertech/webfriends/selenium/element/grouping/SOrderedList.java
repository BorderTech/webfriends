package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HOrderedList;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagOL;

/**
 * Selenium ordered list element.
 */
public class SOrderedList extends AbstractListContainerElementSelenium implements HOrderedList {

	@Override
	public STagOL getTagType() {
		return SeleniumTags.OL;
	}

	@Override
	public boolean isReversed() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int getStart() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public MarkerType getMarkerType() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
