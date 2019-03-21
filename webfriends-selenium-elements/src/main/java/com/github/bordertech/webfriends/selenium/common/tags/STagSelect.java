package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagSelect;
import com.github.bordertech.webfriends.selenium.element.form.select.SSelect;

/**
 * HTML <code>select</code> tag.
 */
public class STagSelect extends AbstractTag<SSelect> implements TagSelect<SSelect> {

	/**
	 * Default constructor.
	 */
	public STagSelect() {
		super(SSelect.class);
	}

}
