package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagForm;
import com.github.bordertech.webfriends.selenium.element.form.SForm;

/**
 * HTML <code>form</code> tag.
 */
public class STagForm extends AbstractTag<SForm> implements TagForm<SForm> {

	/**
	 * Default constructor.
	 */
	public STagForm() {
		super(SForm.class);
	}

}
