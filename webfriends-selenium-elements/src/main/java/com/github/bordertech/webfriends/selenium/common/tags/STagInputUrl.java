package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagInputUrl;
import com.github.bordertech.webfriends.selenium.element.form.input.SUrlField;

/**
 * HTML <code>input</code> URL tag.
 */
public class STagInputUrl extends AbstractInputTag<SUrlField> implements TagInputUrl<SUrlField> {

	/**
	 * Default constructor.
	 */
	public STagInputUrl() {
		super(SUrlField.class);
	}

}
