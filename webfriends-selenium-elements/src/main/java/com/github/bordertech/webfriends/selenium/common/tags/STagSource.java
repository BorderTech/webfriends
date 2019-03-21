package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagSource;
import com.github.bordertech.webfriends.selenium.element.embedded.SSource;

/**
 * HTML <code>source</code> tag.
 */
public class STagSource extends AbstractTag<SSource> implements TagSource<SSource> {

	/**
	 * Default constructor.
	 */
	public STagSource() {
		super(SSource.class);
	}

}
