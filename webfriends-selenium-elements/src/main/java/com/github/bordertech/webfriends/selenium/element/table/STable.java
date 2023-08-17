package com.github.bordertech.webfriends.selenium.element.table;

import com.github.bordertech.webfriends.api.element.table.HTable;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagTable;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * Selenium table element.
 */
public class STable extends AbstractSElement implements HTable {

	@Override
	public STagTable getTagType() {
		return SeleniumTags.TABLE;
	}

	@Override
	public List<? extends SHeaderCell> getColumnHeaders() {
		return getDriver().findWebFriends(SeleniumTags.TH, this.getWebElement(), By.tagName("th"));
	}

	@Override
	public SRow getRow(final int rowIdx) {
		List<SRow> sRows = getRows();
		if (CollectionUtils.isEmpty(sRows) || CollectionUtils.size(sRows) - 1 < rowIdx) {
			throw new IllegalArgumentException("Invalid row selection of " + rowIdx);
		}
		return sRows.get(rowIdx);
	}

	@Override
	public List<SRow> getRows() {
		return getDriver().findWebFriends(SeleniumTags.TR, this.getWebElement(), By.tagName("tr"));
	}

	@Override
	public SHeaderCell getColumnHeader(final int colIdx) {
		List<? extends SHeaderCell> columnHeaders = getColumnHeaders();
		if (CollectionUtils.isEmpty(columnHeaders) || CollectionUtils.size(columnHeaders) - 1 < colIdx) {
			throw new IllegalArgumentException("Invalid column header selection of " + colIdx);
		}
		return columnHeaders.get(colIdx);
	}

	@Override
	public List<? extends CellElementSelenium> getColumnDataCells(final int colIdx) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public String getTableCaption() {
		SCaption caption = getDriver().findWebFriend(SeleniumTags.CAPTION, this.getWebElement(), By.tagName("caption"));
		return caption.getWebElement().getText();
	}

	@Override
	public int getColumnCount() {
		return CollectionUtils.size(getColumnHeaders());
	}

	@Override
	public int getColumnHeaderIndex(final String label) {
		List<? extends SHeaderCell> columnHeaders = getColumnHeaders();
		return IntStream.range(0, columnHeaders.size())
				.filter(i -> StringUtils.equals(columnHeaders.get(i).getHeaderText(), label))
				.findFirst()
				.orElseThrow((Supplier<IllegalArgumentException>) () -> {
					throw new IllegalArgumentException("Invalid column header label");
				});
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
		return CollectionUtils.size(getRows());
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
