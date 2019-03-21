package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagVideo;
import com.github.bordertech.webfriends.selenium.common.tag.TagMediaTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.embedded.SVideo;

/**
 * HTML <code>video</code> tag.
 */
public class STagVideo extends AbstractTag<SVideo> implements TagMediaTypeSelenium<SVideo>, TagVideo<SVideo> {

	/**
	 * Default constructor.
	 */
	public STagVideo() {
		super(SVideo.class);
	}

}
