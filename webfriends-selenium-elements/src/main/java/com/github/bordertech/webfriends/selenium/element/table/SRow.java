package com.github.bordertech.webfriends.selenium.element.table;

import com.github.bordertech.webfriends.api.element.table.CellElement;
import com.github.bordertech.webfriends.api.element.table.HRow;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagTR;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import org.apache.commons.collections.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Selenium row of cells in a table.
 */
public class SRow extends AbstractSElement implements HRow {

	@Override
	public STagTR getTagType() {
		return SeleniumTags.TR;
	}

	@Override
	public List<? extends CellElement> getRowCells() {
		return Stream.concat(getHeaderCells().stream(), getDataCells().stream())
				.collect(Collectors.toList());
	}

	@Override
	public CellElementSelenium getRowCell(final int colIdx) {
		if (hasRowHeaderCells()) {
			return getRowCellAsHeader(colIdx);
		} else {
			return getRowCellAsData(colIdx);
		}
	}


	@Override
	public SHeaderCell getRowCellAsHeader(final int colIdx) {
		List<SHeaderCell> sHeaderCells = getHeaderCells();
		if (CollectionUtils.isEmpty(sHeaderCells) || CollectionUtils.size(sHeaderCells) - 1 < colIdx) {
			throw new IllegalArgumentException("Invalid column selection of " + colIdx);
		}
		return sHeaderCells.get(colIdx);
	}

	@Override
	public SDataCell getRowCellAsData(int colIdx) {
		List<SDataCell> sDataCells = getDataCells();
		if (CollectionUtils.isEmpty(sDataCells) || CollectionUtils.size(sDataCells) - 1 < colIdx) {
			throw new IllegalArgumentException("Invalid column selection of " + colIdx);
		}
		return sDataCells.get(colIdx);
	}

	@Override
	public boolean hasRowHeaderCells() {
		return CollectionUtils.isNotEmpty(getHeaderCells());
	}

	@Override
	public boolean hasRowDataCells() {
		return CollectionUtils.isNotEmpty(getDataCells());
	}

	private List<SHeaderCell> getHeaderCells() {
		return getDriver().findWebFriends(SeleniumTags.TH, this.getWebElement());
	}

	private List<SDataCell> getDataCells() {
		return getDriver().findWebFriends(SeleniumTags.TD, this.getWebElement());
	}

}
