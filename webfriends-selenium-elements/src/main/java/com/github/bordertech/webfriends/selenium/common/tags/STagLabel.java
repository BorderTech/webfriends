package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagLabel;
import com.github.bordertech.webfriends.selenium.element.form.SLabel;

/**
 * HTML <code>label</code> tag.
 */
public class STagLabel extends AbstractTag<SLabel> implements TagLabel<SLabel> {

	/**
	 * Default constructor.
	 */
	public STagLabel() {
		super(SLabel.class);
	}

}
