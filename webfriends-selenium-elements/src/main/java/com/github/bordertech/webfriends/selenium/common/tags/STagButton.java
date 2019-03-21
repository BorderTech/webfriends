package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagButton;
import com.github.bordertech.webfriends.selenium.element.form.SButton;

/**
 * HTML <code>button</code> tag.
 */
public class STagButton extends AbstractTag<SButton> implements TagButton<SButton> {

	/**
	 * Default constructor.
	 */
	public STagButton() {
		super(SButton.class);
	}

}
