package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagInputEmail;
import com.github.bordertech.webfriends.selenium.element.form.input.SEmailField;

/**
 * HTML <code>input</code> email tag.
 */
public class STagInputEmail extends AbstractInputTag<SEmailField> implements TagInputEmail<SEmailField> {

	/**
	 * Default constructor.
	 */
	public STagInputEmail() {
		super(SEmailField.class);
	}

}
