package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagSection;
import com.github.bordertech.webfriends.selenium.element.sections.SSection;

/**
 * HTML <code>section</code> tag.
 */
public class STagSection extends AbstractTag<SSection> implements TagSection<SSection> {

	/**
	 * Default constructor.
	 */
	public STagSection() {
		super(SSection.class);
	}

}
