package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagAudio;
import com.github.bordertech.webfriends.selenium.common.tag.TagMediaTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.embedded.SAudio;

/**
 * HTML <code>audio</code> tag.
 */
public class STagAudio extends AbstractTag<SAudio> implements TagMediaTypeSelenium<SAudio>, TagAudio<SAudio> {

	/**
	 * Default constructor.
	 */
	public STagAudio() {
		super(SAudio.class);
	}

}
