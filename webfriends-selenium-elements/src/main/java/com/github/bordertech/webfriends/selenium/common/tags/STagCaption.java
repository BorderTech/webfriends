package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagCaption;
import com.github.bordertech.webfriends.selenium.element.table.SCaption;

/**
 * HTML <code>caption</code> tag.
 */
public class STagCaption extends AbstractTag<SCaption> implements TagCaption<SCaption> {

	/**
	 * Default constructor.
	 */
	public STagCaption() {
		super(SCaption.class);
	}

}
