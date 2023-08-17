package com.github.bordertech.webfriends.api.element.table;

import com.github.bordertech.webfriends.api.common.combo.FlowPalpableElement;
import com.github.bordertech.webfriends.api.common.model.ScriptSupportingModel;
import com.github.bordertech.webfriends.api.common.tags.TagTable;
import java.util.List;

/**
 * Table element.
 * <p>
 * Must be the parent of caption, colgroup, thead, tbody, tr, tfoot and scripting elements.
 * </p>
 */
public interface HTable extends FlowPalpableElement, ScriptSupportingModel {

	@Override
	TagTable getTagType();

	/**
	 * @return the table caption
	 */
	String getTableCaption();

	/**
	 * @return the number of columns
	 */
	int getColumnCount();

	/**
	 * @return the list of column details
	 */
	List<? extends HHeaderCell> getColumnHeaders();

	/**
	 * @param colIdx the column index (starting at 1)
	 * @return the column header for this index
	 */
	HHeaderCell getColumnHeader(final int colIdx);

	/**
	 * @param label the column label
	 * @return the matching column index (starting at 1) or 0 if no match
	 */
	int getColumnHeaderIndex(final String label);

	/**
	 * @param colIdx the column index (starting at 1)
	 * @return the list of row cells for a column
	 */
	List<? extends CellElement> getColumnDataCells(final int colIdx);

	/**
	 * @return true if the table is currently sorted
	 */
	boolean isSorted();

	/**
	 * @return true if sorted ascending
	 */
	boolean isSortedAscending();

	/**
	 * @return the sorted column index (starting at 1) or 0 if table not sorted
	 */
	int getSortedColumnIndex();

	/**
	 * @return the number of data rows
	 */
	int getRowCount();

	/**
	 * @param rowIdx the row index (starting at 1)
	 * @return the data row for this row index
	 */
	HRow getRow(final int rowIdx);

	/**
	 * @return the list of rows
	 */
	List<? extends HRow> getRows();


	/**
	 * @return the no data message or null
	 */
	String getNoDataMessage();

	/**
	 * Sort via this column.
	 *
	 * @param colIdx the column index to sort starting at 1
	 * @param ascending true if ascending
	 */
	void sort(final int colIdx, final boolean ascending);

	/**
	 * @return true if table is paginated
	 */
	boolean isPaginated();

	/**
	 * @return the number of pages
	 */
	int getPageCount();

	/**
	 * @return the current page
	 */
	int getCurrentPage();

	/**
	 * @param page the page to navigate to (starting at 1)
	 */
	void gotoPage(final int page);

	/**
	 * Goto the first page.
	 */
	void gotoFirstPage();

	/**
	 * Goto the previous page.
	 */
	void gotoPrevPage();

	/**
	 * Goto the next page.
	 */
	void gotoNextPage();

	/**
	 * Goto the last page.
	 */
	void gotoLastPage();
}
