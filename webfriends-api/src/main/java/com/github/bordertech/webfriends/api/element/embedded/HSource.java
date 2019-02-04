package com.github.bordertech.webfriends.api.element.embedded;

import com.github.bordertech.webfriends.api.common.category.NoCategory;
import com.github.bordertech.webfriends.api.common.model.NothingContentModel;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;

/**
 * Source element.
 */
public interface HSource extends NoCategory, MediaElementContext, NothingContentModel {

	@Override
	public default ElementTag<? extends HSource> getElementTag() {
		return StandardTags.SOURCE;
	}

	/**
	 * @return the address of the resource
	 */
	String getSourceUrl();

	/**
	 * @return the MIME Type of thew resource
	 */
	String getMimeType();

}
