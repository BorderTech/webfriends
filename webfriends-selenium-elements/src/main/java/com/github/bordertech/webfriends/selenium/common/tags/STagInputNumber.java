package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagInputNumber;
import com.github.bordertech.webfriends.selenium.element.form.input.SNumberField;

/**
 * HTML <code>input</code> number tag.
 */
public class STagInputNumber extends AbstractInputTag<SNumberField> implements TagInputNumber<SNumberField> {

	/**
	 * Default constructor.
	 */
	public STagInputNumber() {
		super(SNumberField.class);
	}

}
