package com.github.bordertech.webfriends.selenium.element.embedded;

import com.github.bordertech.webfriends.api.element.embedded.HAudio;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagAudio;

/**
 * Selenium Audio element.
 */
public class SAudio extends MediaElementSelenium implements HAudio {

	@Override
	public STagAudio getTagType() {
		return SeleniumTags.AUDIO;
	}

}
