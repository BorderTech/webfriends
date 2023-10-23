package com.github.bordertech.webfriends.api.element.textlevel;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.model.PhrasingModel;
import com.github.bordertech.webfriends.api.common.tags.TagStrong;

/**
 * Strong element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/strong">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-strong-element">HTML Spec</a>
 */
public interface HStrong extends FlowContent, PalpableContent,
		FlowContext,
		PhrasingModel {

	@Override
	TagStrong getTagType();

}
