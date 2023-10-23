package com.github.bordertech.webfriends.api.element.metadata;

import com.github.bordertech.webfriends.api.common.category.NoCategory;
import com.github.bordertech.webfriends.api.common.context.CustomContext;
import com.github.bordertech.webfriends.api.common.model.MetadataContentModel;
import com.github.bordertech.webfriends.api.common.tags.TagHead;
import com.github.bordertech.webfriends.api.element.Element;
import com.github.bordertech.webfriends.api.element.document.HHtmlRoot;
import java.util.Arrays;
import java.util.List;

/**
 * The head element represents a collection of metadata for the Document.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/head">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-head-element">HTML Spec</a>
 */
public interface HHead extends NoCategory, CustomContext, MetadataContentModel {

	@Override
	TagHead getTagType();

	@Override
	default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(HHtmlRoot.class);
	}

}
