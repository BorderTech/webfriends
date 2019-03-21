package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagFieldSet;
import com.github.bordertech.webfriends.selenium.element.form.other.SFieldSet;

/**
 * HTML <code>fieldset</code> tag.
 */
public class STagFieldSet extends AbstractTag<SFieldSet> implements TagFieldSet<SFieldSet> {

	/**
	 * Default constructor.
	 */
	public STagFieldSet() {
		super(SFieldSet.class);
	}

}
