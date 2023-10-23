package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagDetails;
import com.github.bordertech.webfriends.selenium.element.interactive.SDetails;

/**
 * HTML <code>details</code> tag.
 */
public class STagDetails extends AbstractTag<SDetails> implements TagDetails<SDetails> {

	/**
	 * Default constructor.
	 */
	public STagDetails() {
		super(SDetails.class);
	}

}
