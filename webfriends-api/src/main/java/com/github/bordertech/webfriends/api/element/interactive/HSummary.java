package com.github.bordertech.webfriends.api.element.interactive;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.model.ScriptSupportingModel;
import com.github.bordertech.webfriends.api.common.tags.TagSummary;

/**
 * Summary element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/summary">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-summary-element">HTML Spec</a>
 */
public interface HSummary extends FlowContent, PalpableContent,
		FlowContext,
		FlowModel, ScriptSupportingModel {

	@Override
	TagSummary getTagType();

}
