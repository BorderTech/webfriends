package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagOption;
import com.github.bordertech.webfriends.selenium.element.form.select.SOption;

/**
 * HTML <code>option</code> ordered list tag.
 */
public class STagOption extends AbstractTag<SOption> implements TagOption<SOption> {

	/**
	 * Default constructor.
	 */
	public STagOption() {
		super(SOption.class);
	}

}
