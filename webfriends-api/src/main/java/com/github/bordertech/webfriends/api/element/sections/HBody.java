package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.category.NoCategory;
import com.github.bordertech.webfriends.api.common.context.CustomContext;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.tags.TagBody;
import com.github.bordertech.webfriends.api.element.Element;
import com.github.bordertech.webfriends.api.element.document.HHtmlRoot;
import java.util.Arrays;
import java.util.List;

/**
 * The body element represents the contents of the document.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/body">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-body-element">HTML Spec</a>
 */
public interface HBody extends NoCategory, CustomContext, FlowModel, CustomModel {

	@Override
	TagBody getTagType();

	@Override
	default List<Class<? extends Element>> getContextsAllowed() {
		return Arrays.asList(HHtmlRoot.class);
	}

	@Override
	default List<Class<? extends Element>> getDescendantsExcluded() {
		return Arrays.asList(HBody.class);
	}

}
