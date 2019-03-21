package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagFigure;
import com.github.bordertech.webfriends.selenium.element.grouping.SFigure;

/**
 * HTML <code>figure</code> tag.
 */
public class STagFigure extends AbstractTag<SFigure> implements TagFigure<SFigure> {

	/**
	 * Default constructor.
	 */
	public STagFigure() {
		super(SFigure.class);
	}

}
