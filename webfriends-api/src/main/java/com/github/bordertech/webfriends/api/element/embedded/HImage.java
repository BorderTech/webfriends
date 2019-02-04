package com.github.bordertech.webfriends.api.element.embedded;

import com.github.bordertech.webfriends.api.common.capability.Dimensionable;
import com.github.bordertech.webfriends.api.common.category.EmbeddedContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.EmbeddedContext;
import com.github.bordertech.webfriends.api.common.model.NothingContentModel;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Image element.
 */
public interface HImage extends EmbeddedContent, PalpableContent,
		Dimensionable,
		EmbeddedContext, NothingContentModel {

	@Override
	public default ElementTag<? extends HImage> getElementTag() {
		return StandardTags.IMG;
	}

	/**
	 * @return the address of the resource
	 */
	String getSource();

	/**
	 * @return the alternate text when image is not available
	 */
	String getAlt();

}
