package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HUnorderedList;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagUnorderedList;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriverUtil;
import java.util.List;

/**
 * Selenium list (unordered) element.
 */
public class SUnorderedList extends AbstractSElement implements HUnorderedList<SUnorderedListItem>, ListContainerElementSelenium<SUnorderedListItem> {

	private List<SUnorderedListItem> items = null;

	@Override
	public STagUnorderedList getTagType() {
		return SeleniumTags.UL;
	}

	@Override
	public List<SUnorderedListItem> getListItems() {
		if (items == null) {
			items = SmartDriverUtil.findWebFriends(getDriver(), getWebElement(), SeleniumTags.LISTITEM);
		}
		return items;
	}

}
