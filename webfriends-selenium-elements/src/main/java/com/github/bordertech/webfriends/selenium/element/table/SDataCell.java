package com.github.bordertech.webfriends.selenium.element.table;

import com.github.bordertech.webfriends.api.element.table.HDataCell;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagTD;

/**
 * Selenium table data cell (ie td element).
 */
public class SDataCell extends AbstractSElement implements HDataCell, CellElementSelenium {

	@Override
	public STagTD getTagType() {
		return SeleniumTags.TD;
	}

}
