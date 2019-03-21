package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagTextArea;
import com.github.bordertech.webfriends.selenium.element.form.text.STextArea;

/**
 * HTML <code>textarea</code> tag.
 */
public class STagTextArea extends AbstractTag<STextArea> implements TagTextArea<STextArea> {

	/**
	 * Default constructor.
	 */
	public STagTextArea() {
		super(STextArea.class);
	}

}
