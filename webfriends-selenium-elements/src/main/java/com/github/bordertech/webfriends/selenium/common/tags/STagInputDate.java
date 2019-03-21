package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagInputDate;
import com.github.bordertech.webfriends.selenium.element.form.input.SDateField;

/**
 * HTML <code>input</code> date tag.
 */
public class STagInputDate extends AbstractInputTag<SDateField> implements TagInputDate<SDateField> {

	/**
	 * Default constructor.
	 */
	public STagInputDate() {
		super(SDateField.class);
	}

}
