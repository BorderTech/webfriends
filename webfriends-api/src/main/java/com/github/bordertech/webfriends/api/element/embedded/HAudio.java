package com.github.bordertech.webfriends.api.element.embedded;

import com.github.bordertech.webfriends.api.common.tags.TagAudio;

/**
 * Audio element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/audio">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-audio-element">HTML Spec</a>
 */
public interface HAudio extends MediaElement {

	@Override
	TagAudio getTagType();

}
