package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagH2;
import com.github.bordertech.webfriends.selenium.element.sections.SHeading2;

/**
 * HTML <code>h2</code> tag.
 */
public class STagH2 extends AbstractHeadingTag<SHeading2> implements TagH2<SHeading2> {

	/**
	 * Default constructor.
	 */
	public STagH2() {
		super(SHeading2.class);
	}

}
