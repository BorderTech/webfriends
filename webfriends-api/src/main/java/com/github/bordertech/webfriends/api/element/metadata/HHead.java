package com.github.bordertech.webfriends.api.element.metadata;

import com.github.bordertech.webfriends.api.common.category.NoCategory;
import com.github.bordertech.webfriends.api.common.context.CustomContext;
import com.github.bordertech.webfriends.api.common.model.MetadataContentModel;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;
import com.github.bordertech.webfriends.api.element.Element;
import com.github.bordertech.webfriends.api.element.document.HHtmlRoot;
import java.util.Arrays;
import java.util.List;

/**
 * The head element represents a collection of metadata for the Document.
 */
public interface HHead extends NoCategory, CustomContext, MetadataContentModel {

	@Override
	public default ElementTag<? extends HHead> getElementTag() {
		return StandardTags.HEAD;
	}

	@Override
	public default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(HHtmlRoot.class);
	}

}
