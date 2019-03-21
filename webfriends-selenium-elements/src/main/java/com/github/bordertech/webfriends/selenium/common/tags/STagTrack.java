package com.github.bordertech.webfriends.selenium.common.tags;

import com.github.bordertech.webfriends.api.common.tags.TagTrack;
import com.github.bordertech.webfriends.selenium.element.embedded.STrack;

/**
 * HTML <code>track</code> tag.
 */
public class STagTrack extends AbstractTag<STrack> implements TagTrack<STrack> {

	/**
	 * Default constructor.
	 */
	public STagTrack() {
		super(STrack.class);
	}

}
