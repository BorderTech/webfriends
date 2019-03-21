package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagInputRange;
import com.github.bordertech.webfriends.selenium.element.form.input.SRangeField;

/**
 * HTML <code>input</code> range tag.
 */
public class STagInputRange extends AbstractInputTag<SRangeField> implements TagInputRange<SRangeField> {

	/**
	 * Default constructor.
	 */
	public STagInputRange() {
		super(SRangeField.class);
	}

}
