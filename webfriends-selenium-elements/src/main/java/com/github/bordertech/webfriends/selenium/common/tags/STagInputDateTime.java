package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagInputDateTime;
import com.github.bordertech.webfriends.selenium.element.form.input.SDatetimeField;

/**
 * HTML <code>input</code> datetime tag.
 */
public class STagInputDateTime extends AbstractInputTag<SDatetimeField> implements TagInputDateTime<SDatetimeField> {

	/**
	 * Default constructor.
	 */
	public STagInputDateTime() {
		super(SDatetimeField.class);
	}

}
