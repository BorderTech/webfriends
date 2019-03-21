package com.github.bordertech.webfriends.api.element.table;

import com.github.bordertech.webfriends.api.common.category.SectioningRoot;
import com.github.bordertech.webfriends.api.common.tags.TagTD;

/**
 * Table data cell (ie td element).
 */
public interface HDataCell extends CellElement, SectioningRoot {

	@Override
	TagTD getTagType();

}
