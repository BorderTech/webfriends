package com.github.bordertech.webfriends.api.element.table;

import com.github.bordertech.webfriends.api.common.category.SectioningRoot;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Table data cell (ie td element).
 */
public interface HDataCell extends CellElement, SectioningRoot {

	@Override
	public default ElementTag<? extends HDataCell> getElementTag() {
		return StandardTags.TD;
	}
}
