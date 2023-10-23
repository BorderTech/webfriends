package com.github.bordertech.webfriends.api.common.category;

/**
 * Element that defines the header details of a section.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Content_categories#heading_content">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#heading-content">HTML Spec</a>
 */
public interface HeadingContent extends FlowContent {

	/**
	 * @return the heading text
	 */
	String getHeadingText();

}
