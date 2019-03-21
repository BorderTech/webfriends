package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HOrderedList;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import java.util.List;
import com.github.bordertech.webfriends.selenium.common.tags.STagOrderedList;

/**
 * Selenium ordered list element.
 */
public class SOrderedList extends AbstractSElement implements HOrderedList<SOrderedListItem>, ListContainerElementSelenium<SOrderedListItem> {

	@Override
	public STagOrderedList getTagType() {
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

	@Override
	public List<SOrderedListItem> getListItems() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
