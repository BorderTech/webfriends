package com.github.bordertech.webfriends.api.element.interactive;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.model.ScriptSupportingModel;
import com.github.bordertech.webfriends.api.common.tags.TagDetails;

/**
 * Details element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/details">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-details-element">HTML Spec</a>
 */
public interface HDetails extends FlowContent, PalpableContent,
		FlowContext,
		FlowModel, ScriptSupportingModel {

	@Override
	TagDetails getTagType();

}
