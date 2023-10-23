package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.model.PhrasingModel;
import com.github.bordertech.webfriends.api.common.tags.TagP;

/**
 * Paragraph element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/p">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-p-element">HTML Spec</a>
 */
public interface HParagraph extends FlowContent, PalpableContent,
		FlowContext,
		PhrasingModel {

	@Override
	TagP getTagType();

}
