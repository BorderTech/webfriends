package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagInputColor;
import com.github.bordertech.webfriends.selenium.element.form.input.SColorField;

/**
 * HTML <code>input</code> color tag.
 */
public class STagInputColor extends AbstractInputTag<SColorField> implements TagInputColor<SColorField> {

	/**
	 * Default constructor.
	 */
	public STagInputColor() {
		super(SColorField.class);
	}

}
