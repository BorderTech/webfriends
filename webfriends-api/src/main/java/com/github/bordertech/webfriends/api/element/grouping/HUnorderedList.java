package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.tags.TagUL;

/**
 * List (unordered) element.
 *
 * @see <a href="https://html.spec.whatwg.org/#the-ul-element">Web Docs</a>
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/ul">HTML Spec</a>
 */
public interface HUnorderedList extends ListContainerElement {

	@Override
	TagUL getTagType();

}
