package com.github.bordertech.webfriends.selenium.element.embedded;

import com.github.bordertech.webfriends.api.element.embedded.HVideo;
import com.github.bordertech.webfriends.selenium.common.capability.DimensionableSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;

/**
 * Selenium video element.
 */
public class SVideo extends MediaElementSelenium implements HVideo, DimensionableSelenium {

	@Override
	public SeleniumTag<? extends SVideo> getElementTag() {
		return SeleniumTags.VIDEO;
	}

	@Override
	public String getPosterUrl() {
		return getAttribute("poster");
	}

	@Override
	public boolean isPlaysInline() {
		return getAttributeAsBoolean("playsinline");
	}

}
