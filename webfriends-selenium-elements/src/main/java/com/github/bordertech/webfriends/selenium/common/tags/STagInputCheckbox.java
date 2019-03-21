package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagInputCheckbox;
import com.github.bordertech.webfriends.selenium.element.form.input.SCheckBox;

/**
 * HTML <code>input</code> checkbox tag.
 */
public class STagInputCheckbox extends AbstractInputTag<SCheckBox> implements TagInputCheckbox<SCheckBox> {

	/**
	 * Default constructor.
	 */
	public STagInputCheckbox() {
		super(SCheckBox.class);
	}

}
