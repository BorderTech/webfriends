package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagTable;
import com.github.bordertech.webfriends.selenium.element.table.STable;

/**
 * HTML <code>table</code> tag.
 */
public class STagTable extends AbstractTag<STable> implements TagTable<STable> {

	/**
	 * Default constructor.
	 */
	public STagTable() {
		super(STable.class);
	}

}
