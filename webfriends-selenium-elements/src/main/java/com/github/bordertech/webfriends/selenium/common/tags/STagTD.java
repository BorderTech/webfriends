package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagTD;
import com.github.bordertech.webfriends.selenium.element.table.SDataCell;

/**
 * HTML <code>td</code> data cell tag.
 */
public class STagTD extends AbstractTag<SDataCell> implements TagTD<SDataCell> {

	/**
	 * Default constructor.
	 */
	public STagTD() {
		super(SDataCell.class);
	}

}
