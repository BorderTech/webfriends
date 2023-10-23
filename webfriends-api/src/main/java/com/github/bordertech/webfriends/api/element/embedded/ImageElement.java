package com.github.bordertech.webfriends.api.element.embedded;

import com.github.bordertech.webfriends.api.common.capability.Dimensionable;
import com.github.bordertech.webfriends.api.common.category.EmbeddedContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.EmbeddedContext;
import com.github.bordertech.webfriends.api.common.model.NothingContentModel;
import com.github.bordertech.webfriends.api.common.tag.TagImageType;

/**
 * Image element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/img">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-img-element">HTML Spec</a>
 */
public interface ImageElement extends EmbeddedContent, PalpableContent,
		EmbeddedContext,
		NothingContentModel,
		Dimensionable {

	@Override
	TagImageType getTagType();

	/**
	 * @return the address of the resource
	 */
	String getSource();

	/**
	 * @return the alternate text when image is not available
	 */
	String getAlt();

}
