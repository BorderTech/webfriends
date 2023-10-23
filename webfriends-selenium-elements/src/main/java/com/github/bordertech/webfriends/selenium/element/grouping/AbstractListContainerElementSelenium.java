package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithButtons;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithChildren;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriverUtil;
import java.util.List;

/**
 * Abstract selenium list container element.
 */
public abstract class AbstractListContainerElementSelenium extends AbstractSElement implements ListContainerElementSelenium,
		ContainerWithChildren, ContainerWithButtons {

	private List<SListItem> items = null;

	@Override
	public List<SListItem> getListItems() {
		if (items == null) {
			items = SmartDriverUtil.findWebFriends(getDriver(), getWebElement(), SeleniumTags.LI);
		}
		return items;
	}

}
