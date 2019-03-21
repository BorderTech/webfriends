package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagProgress;
import com.github.bordertech.webfriends.selenium.element.form.other.SProgress;

/**
 * HTML <code>progress</code> tag.
 */
public class STagProgress extends AbstractTag<SProgress> implements TagProgress<SProgress> {

	/**
	 * Default constructor.
	 */
	public STagProgress() {
		super(SProgress.class);
	}

}
