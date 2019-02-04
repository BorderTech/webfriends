package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.category.SectioningRoot;
import com.github.bordertech.webfriends.api.common.context.CustomContext;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;
import com.github.bordertech.webfriends.api.element.Element;
import com.github.bordertech.webfriends.api.element.document.HHtmlRoot;
import java.util.Arrays;
import java.util.List;

/**
 * The body element represents the contents of the document.
 */
public interface HBody extends SectioningRoot, CustomContext, FlowModel, CustomModel {

	@Override
	public default ElementTag<? extends HBody> getElementTag() {
		return StandardTags.BODY;
	}

	@Override
	public default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(HHtmlRoot.class);
	}

	@Override
	public default List<Class<? extends Element>> getDescendantsExcluded() {
		return Arrays.asList(HBody.class);
	}

}
