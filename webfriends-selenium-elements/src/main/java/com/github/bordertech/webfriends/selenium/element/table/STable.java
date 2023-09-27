package com.github.bordertech.webfriends.selenium.element.table;

import com.github.bordertech.webfriends.api.element.table.HTable;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagTable;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriverUtil;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

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
		return SmartDriverUtil.findWebFriends(getDriver(), getWebElement(), SeleniumTags.TH);
	}

	@Override
	public SRow getRow(final int rowIdx) {
		List<? extends SRow> sRows = getRows();
		if (CollectionUtils.isEmpty(sRows) || CollectionUtils.size(sRows) - 1 < rowIdx) {
			throw new IllegalArgumentException("Invalid row selection of " + rowIdx);
		}
		return sRows.get(rowIdx);
	}

	@Override
	public List<? extends SRow> getRows() {
		return SmartDriverUtil.findWebFriends(getDriver(), getWebElement(), SeleniumTags.TR);
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
		return SmartDriverUtil.findWebFriend(getDriver(), getWebElement(), SeleniumTags.CAPTION).getWebElement().getText();
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
