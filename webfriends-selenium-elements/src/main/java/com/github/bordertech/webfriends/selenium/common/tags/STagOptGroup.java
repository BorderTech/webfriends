package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagOptGroup;
import com.github.bordertech.webfriends.selenium.element.form.select.SOptGroup;

/**
 * HTML <code>optgroup</code> tag.
 */
public class STagOptGroup extends AbstractTag<SOptGroup> implements TagOptGroup<SOptGroup> {

	/**
	 * Default constructor.
	 */
	public STagOptGroup() {
		super(SOptGroup.class);
	}

}
