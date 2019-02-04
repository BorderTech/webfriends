package com.github.bordertech.webfriends.api.element.embedded;

import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Audio element.
 */
public interface HAudio extends MediaElement {

	@Override
	public default ElementTag<? extends HAudio> getElementTag() {
		return StandardTags.AUDIO;
	}

}
