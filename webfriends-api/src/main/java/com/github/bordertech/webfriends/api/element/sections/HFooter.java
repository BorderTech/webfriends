package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.tags.TagFooter;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;

/**
 * Footer element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/footer">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-footer-element">HTML Spec</a>
 */
public interface HFooter extends FlowContent, PalpableContent, FlowContext, FlowModel, CustomModel {

	@Override
	TagFooter getTagType();

	@Override
	default List<Class<? extends Element>> getDescendantsExcluded() {
		return Arrays.asList(HHeader.class, HFooter.class);
	}

}
