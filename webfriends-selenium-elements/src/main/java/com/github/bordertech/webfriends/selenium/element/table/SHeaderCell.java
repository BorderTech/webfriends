package com.github.bordertech.webfriends.selenium.element.table;

import com.github.bordertech.webfriends.api.element.table.HHeaderCell;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagTH;

/**
 * Selenium table header cell (ie th element).
 */
public class SHeaderCell extends AbstractSElement implements HHeaderCell, CellElementSelenium {

	@Override
	public STagTH getTagType() {
		return SeleniumTags.TH;
	}

	@Override
	public String getHeaderText() {
		return getWebElement().getText();
	}

	@Override
	public boolean isSorted() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean isAscending() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean isSortable() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
