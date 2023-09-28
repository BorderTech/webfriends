package com.github.bordertech.webfriends.api.element.textlevel;

import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.category.PhrasingContent;
import com.github.bordertech.webfriends.api.common.context.PhrasingContext;
import com.github.bordertech.webfriends.api.common.model.PhrasingModel;
import com.github.bordertech.webfriends.api.common.tags.TagSpan;

/**
 * Span element.
 */
public interface HSpan extends PhrasingContent, PalpableContent, PhrasingContext, PhrasingModel {

	@Override
	TagSpan getTagType();

}
