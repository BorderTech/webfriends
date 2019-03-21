package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagBody;
import com.github.bordertech.webfriends.selenium.element.sections.SBody;

/**
 * HTML <code>body</code> tag.
 */
public class STagBody extends AbstractTag<SBody> implements TagBody<SBody> {

	/**
	 * Default constructor.
	 */
	public STagBody() {
		super(SBody.class);
	}

}
