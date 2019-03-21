package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagInputPassword;
import com.github.bordertech.webfriends.selenium.element.form.input.SPasswordField;

/**
 * HTML <code>input</code> password tag.
 */
public class STagInputPassword extends AbstractInputTag<SPasswordField> implements TagInputPassword<SPasswordField> {

	/**
	 * Default constructor.
	 */
	public STagInputPassword() {
		super(SPasswordField.class);
	}

}
