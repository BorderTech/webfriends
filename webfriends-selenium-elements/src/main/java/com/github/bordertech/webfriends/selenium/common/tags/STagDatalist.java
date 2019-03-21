package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagDatalist;
import com.github.bordertech.webfriends.selenium.element.form.select.SDatalist;

/**
 * HTML <code>datalist</code> tag.
 */
public class STagDatalist extends AbstractTag<SDatalist> implements TagDatalist<SDatalist> {

	/**
	 * Default constructor.
	 */
	public STagDatalist() {
		super(SDatalist.class);
	}

}
