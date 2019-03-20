package com.github.bordertech.webfriends.selenium.element.table;

import com.github.bordertech.webfriends.api.element.table.HTable;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import java.util.List;

/**
 * Selenium table element.
 */
public class STable extends AbstractSElement implements HTable {

	@Override
	public SeleniumTag<? extends STable> getElementTag() {
		return SeleniumTags.TABLE;
	}

	@Override
	public List<? extends SHeaderCell> getColumnHeaders() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SRow getRow(final int rowIdx) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public SHeaderCell getColumnHeader(final int colIdx) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public List<? extends CellElementSelenium> getColumnDataCells(final int colIdx) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public String getTableCaption() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int getColumnCount() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int getColumnHeaderIndex(final String label) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean isSorted() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean isSortedAscending() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int getSortedColumnIndex() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int getRowCount() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public String getNoDataMessage() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void sort(final int colIdx, final boolean ascending) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public boolean isPaginated() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int getPageCount() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int getCurrentPage() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void gotoPage(final int page) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void gotoFirstPage() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void gotoPrevPage() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void gotoNextPage() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void gotoLastPage() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
