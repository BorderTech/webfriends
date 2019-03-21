package com.github.bordertech.webfriends.selenium.element.table;

import com.github.bordertech.webfriends.api.element.table.HRow;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import java.util.List;
import com.github.bordertech.webfriends.selenium.common.tags.STagTR;

/**
 * Selenium row of cells in a table.
 */
public class SRow extends AbstractSElement implements HRow {

	@Override
	public STagTR getTagType() {
		return SeleniumTags.TR;
	}

	@Override
	public List<? extends CellElementSelenium> getRowCells() {
		throw new UnsupportedOperationException("Not yet supported.");
	}

	@Override
	public CellElementSelenium getRowCell(final int colIdx) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SHeaderCell getRowCellAsHeader(final int colIdx) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SDataCell getRowCellAsData(int colIdx) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SHeaderCell getRowHeader() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean hasRowHeader() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
