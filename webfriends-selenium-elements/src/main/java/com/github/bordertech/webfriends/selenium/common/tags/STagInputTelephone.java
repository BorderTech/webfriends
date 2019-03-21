package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagInputTelephone;
import com.github.bordertech.webfriends.selenium.element.form.input.STelephoneField;

/**
 * HTML <code>input</code> telephone tag.
 */
public class STagInputTelephone extends AbstractInputTag<STelephoneField> implements TagInputTelephone<STelephoneField> {

	/**
	 * Default constructor.
	 */
	public STagInputTelephone() {
		super(STelephoneField.class);
	}

}
