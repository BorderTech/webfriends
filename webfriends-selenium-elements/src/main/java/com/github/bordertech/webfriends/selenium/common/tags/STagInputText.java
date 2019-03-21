package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagInputText;
import com.github.bordertech.webfriends.selenium.element.form.input.STextField;

/**
 * HTML <code>input</code> text tag.
 */
public class STagInputText extends AbstractInputTag<STextField> implements TagInputText<STextField> {

	/**
	 * Default constructor.
	 */
	public STagInputText() {
		super(STextField.class);
	}

}
