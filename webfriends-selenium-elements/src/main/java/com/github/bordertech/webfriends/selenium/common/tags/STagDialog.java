package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagDialog;
import com.github.bordertech.webfriends.selenium.element.interactive.SDialog;

/**
 * HTML <code>dialog</code> tag.
 */
public class STagDialog extends AbstractTag<SDialog> implements TagDialog<SDialog> {

	/**
	 * Default constructor.
	 */
	public STagDialog() {
		super(SDialog.class);
	}

}
