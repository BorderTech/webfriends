package com.github.bordertech.webfriends.api.element.embedded;

import com.github.bordertech.webfriends.api.common.category.NoCategory;
import com.github.bordertech.webfriends.api.common.model.NothingContentModel;
import com.github.bordertech.webfriends.api.common.tags.TagSource;

/**
 * Source element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/source">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-source-element">HTML Spec</a>
 */
public interface HSource extends NoCategory, MediaElementContext, NothingContentModel {

	@Override
	TagSource getTagType();

	/**
	 * @return the address of the resource
	 */
	String getSourceUrl();

	/**
	 * @return the MIME Type of thew resource
	 */
	String getMimeType();

}
