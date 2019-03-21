package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagH3;
import com.github.bordertech.webfriends.selenium.element.sections.SHeading3;

/**
 * HTML <code>h3</code> tag.
 */
public class STagH3 extends AbstractHeadingTag<SHeading3> implements TagH3<SHeading3> {

	/**
	 * Default constructor.
	 */
	public STagH3() {
		super(SHeading3.class);
	}

}
