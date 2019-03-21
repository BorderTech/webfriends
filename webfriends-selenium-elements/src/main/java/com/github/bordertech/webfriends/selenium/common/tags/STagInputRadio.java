package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagInputRadio;
import com.github.bordertech.webfriends.selenium.element.form.input.SRadioButton;

/**
 * HTML <code>input</code> radio button tag.
 */
public class STagInputRadio extends AbstractInputTag<SRadioButton> implements TagInputRadio<SRadioButton> {

	/**
	 * Default constructor.
	 */
	public STagInputRadio() {
		super(SRadioButton.class);
	}

}
