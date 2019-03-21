package com.github.bordertech.webfriends.selenium.element.embedded;

import com.github.bordertech.webfriends.api.element.embedded.HVideo;
import com.github.bordertech.webfriends.selenium.common.capability.DimensionableSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagVideo;

/**
 * Selenium video element.
 */
public class SVideo extends MediaElementSelenium implements HVideo, DimensionableSelenium {

	@Override
	public STagVideo getTagType() {
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
