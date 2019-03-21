package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagImg;
import com.github.bordertech.webfriends.selenium.element.embedded.SImage;

/**
 * HTML <code>img</code> tag.
 */
public class STagImg extends AbstractTag<SImage> implements TagImg<SImage> {

	/**
	 * Default constructor.
	 */
	public STagImg() {
		super(SImage.class);
	}
}
