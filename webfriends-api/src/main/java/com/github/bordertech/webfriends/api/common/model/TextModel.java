package com.github.bordertech.webfriends.api.common.model;

/**
 * Element with text content (ie text nodes) and holds no "children".
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Content_categories#phrasing_content">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#phrasing-content">HTML Spec</a>
 */
public interface TextModel extends ElementModel {

	/**
	 * @return the element text value.
	 */
	String getTextValue();
}
