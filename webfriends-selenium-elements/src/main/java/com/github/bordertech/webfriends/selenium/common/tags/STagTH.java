package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagTH;
import com.github.bordertech.webfriends.selenium.element.table.SHeaderCell;

/**
 * HTML <code>th</code> header cell tag.
 */
public class STagTH extends AbstractTag<SHeaderCell> implements TagTH<SHeaderCell> {

	/**
	 * Default constructor.
	 */
	public STagTH() {
		super(SHeaderCell.class);
	}

}
