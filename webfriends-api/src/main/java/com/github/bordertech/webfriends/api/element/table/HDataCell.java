package com.github.bordertech.webfriends.api.element.table;

import com.github.bordertech.webfriends.api.common.category.SectioningRootContent;
import com.github.bordertech.webfriends.api.common.tags.TagTD;

/**
 * Table data cell (ie td element).
 */
public interface HDataCell extends CellElement, SectioningRootContent {

	@Override
	TagTD getTagType();

}
