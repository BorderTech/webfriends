package com.github.bordertech.webfriends.api.element.embedded;

import com.github.bordertech.webfriends.api.common.tags.TagAudio;

/**
 * Audio element.
 */
public interface HAudio extends MediaElement {

	@Override
	TagAudio getTagType();

}
