package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.tags.TagMenu;
import com.github.bordertech.webfriends.api.element.grouping.ListContainerElement;

/**
 * Menu element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/menu">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-menu-element">HTML Spec</a>
 */
public interface HMenu extends ListContainerElement {

	@Override
	TagMenu getTagType();

}
