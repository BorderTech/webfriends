package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HList;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import java.util.List;

/**
 * Selenium list (unordered) element.
 */
public class SList extends AbstractSElement implements HList<SListItem>, ListElementSelenium<SListItem> {

	private List<SListItem> items = null;

	@Override
	public SeleniumTag<? extends SList> getElementTag() {
		return SeleniumTags.UL;
	}

	@Override
	public List<SListItem> getListItems() {
		if (items == null) {
			items = getHelper().findWebFriends(getDriver(), getWebElement(), SeleniumTags.LISTITEM);
		}
		return items;
	}

}
