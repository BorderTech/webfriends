package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagMeter;
import com.github.bordertech.webfriends.selenium.element.form.other.SMeter;

/**
 * HTML <code>meter</code> tag.
 */
public class STagMeter extends AbstractTag<SMeter> implements TagMeter<SMeter> {

	/**
	 * Default constructor.
	 */
	public STagMeter() {
		super(SMeter.class);
	}

}
