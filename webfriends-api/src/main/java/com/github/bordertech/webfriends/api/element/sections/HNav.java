package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.category.SectioningContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.tags.TagNav;

/**
 * Nav element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/nav">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-nav-element">HTML Spec</a>
 */
public interface HNav extends FlowContent, PalpableContent, SectioningContent, FlowContext, FlowModel {

	@Override
	TagNav getTagType();

}
