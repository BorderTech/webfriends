package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagH1;
import com.github.bordertech.webfriends.selenium.element.sections.SHeading1;

/**
 * HTML <code>h1</code> tag.
 */
public class STagH1 extends AbstractHeadingTag<SHeading1> implements TagH1<SHeading1> {

	/**
	 * Default constructor.
	 */
	public STagH1() {
		super(SHeading1.class);
	}

}
