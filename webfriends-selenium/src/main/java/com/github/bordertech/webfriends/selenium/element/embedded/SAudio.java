package com.github.bordertech.webfriends.selenium.element.embedded;

import com.github.bordertech.webfriends.api.element.embedded.HAudio;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;

/**
 * Selenium Audio element.
 */
public class SAudio extends MediaElementSelenium implements HAudio {

	@Override
	public SeleniumTag<? extends SAudio> getElementTag() {
		return SeleniumTags.AUDIO;
	}

}
