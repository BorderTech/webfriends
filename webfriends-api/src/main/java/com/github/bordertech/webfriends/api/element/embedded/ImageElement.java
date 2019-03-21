package com.github.bordertech.webfriends.api.element.embedded;

import com.github.bordertech.webfriends.api.common.capability.Dimensionable;
import com.github.bordertech.webfriends.api.common.category.EmbeddedContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.EmbeddedContext;
import com.github.bordertech.webfriends.api.common.model.NothingContentModel;
import com.github.bordertech.webfriends.api.common.tag.TagImageType;

/**
 * Image element.
 */
public interface ImageElement extends EmbeddedContent, PalpableContent,
		Dimensionable,
		EmbeddedContext, NothingContentModel {

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
