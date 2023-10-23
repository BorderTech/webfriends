package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.HeadingContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.model.PhrasingModel;
import com.github.bordertech.webfriends.api.common.tag.TagHeadingType;

/**
 * Heading element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/Heading_Elements">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements">HTML Spec</a>
 */
public interface HeadingElement extends FlowContent, PalpableContent, HeadingContent, FlowContext, PhrasingModel {

	@Override
	TagHeadingType getTagType();

	/**
	 * @return the heading level
	 */
	int getHeadingLevel();

}
