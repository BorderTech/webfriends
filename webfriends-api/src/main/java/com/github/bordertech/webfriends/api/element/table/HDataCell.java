package com.github.bordertech.webfriends.api.element.table;

import com.github.bordertech.webfriends.api.common.tags.TagTD;

/**
 * Table data cell (ie td element).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/td">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-td-element">HTML Spec</a>
 */
public interface HDataCell extends CellElement {

	@Override
	TagTD getTagType();

}
