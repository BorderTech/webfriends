package com.github.bordertech.webfriends.api.element.table;

import com.github.bordertech.webfriends.api.common.context.CustomContext;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.tag.TagType;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Table cell element.
 * <p>
 * Must be the child of a tr element.
 * </p>
 *
 */
public interface CellElement extends Element, CustomContext, FlowModel {

	/**
	 * @param <T> the element type
	 * @param tag the element tag
	 * @return the content of the cell
	 */
	<T extends Element> T getCellContentAs(final TagType<T> tag);

	/**
	 * @return the column span which can be null or greater than zero and less than or equal to 1000
	 */
	Integer getColSpan();

	/**
	 * @return the row span which can be null or greater than zero and less than or equal to 65534
	 */
	Integer getRowSpan();

	@Override
	default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(HRow.class);
	}

}
