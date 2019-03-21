package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagTR;
import com.github.bordertech.webfriends.selenium.element.table.SRow;

/**
 * HTML <code>tr</code> tag.
 */
public class STagTR extends AbstractTag<SRow> implements TagTR<SRow> {

	/**
	 * Default constructor.
	 */
	public STagTR() {
		super(SRow.class);
	}

}
