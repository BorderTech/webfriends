package com.github.bordertech.webfriends.api.element.table;

import com.github.bordertech.webfriends.api.common.category.NoCategory;
import com.github.bordertech.webfriends.api.common.category.ScriptSupporting;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.model.ScriptSupportingModel;
import com.github.bordertech.webfriends.api.common.tags.TagTR;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Row of cells in a table.
 * <p>
 * Must be the child of a table, thead, tbody, tfoot, table element.
 * </p>
 */
public interface HRow extends NoCategory, FlowModel, ScriptSupportingModel, CustomModel {

	@Override
	TagTR getTagType();

	/**
	 * @param colIdx the column index (starting at 1)
	 * @return the data cell for the coordinates
	 */
	CellElement getRowCell(final int colIdx);

	/**
	 * @param colIdx the column index (starting at 1)
	 * @return the header cell for the coordinates
	 */
	HHeaderCell getRowCellAsHeader(final int colIdx);

	/**
	 * @param colIdx the column index (starting at 1)
	 * @return the data cell for the coordinates
	 */
	HDataCell getRowCellAsData(final int colIdx);

	/**
	 * @return the row header cell for this row or null
	 */
	HHeaderCell getRowHeader();

	/**
	 * @return true if the row has a header
	 */
	boolean hasRowHeader();

	/**
	 * @return the cell elements for this row. Could be a mix of data and header elements if the row has a header.
	 */
	List<? extends CellElement> getRowCells();

	@Override
	default List<Class<? extends Element>> getChildrenAllowed() {
		return Arrays.asList(ScriptSupporting.class,
				CellElement.class
		);
	}
}
