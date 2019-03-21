package com.github.bordertech.webfriends.api.element.embedded;

import com.github.bordertech.webfriends.api.common.capability.Dimensionable;
import com.github.bordertech.webfriends.api.common.tags.TagVideo;

/**
 * Video element.
 */
public interface HVideo extends MediaElement, Dimensionable {

	@Override
	TagVideo getTagType();

	/**
	 * @return the URL of the image to show as the poster frame prior to video playback
	 */
	String getPosterUrl();

	/**
	 * @return true if plays inline
	 */
	boolean isPlaysInline();

}
