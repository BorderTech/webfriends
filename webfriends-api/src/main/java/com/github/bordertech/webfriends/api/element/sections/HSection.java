package com.github.bordertech.webfriends.api.element.sections;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.category.SectioningContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.tags.TagSection;

/**
 * A section element represents a generic section of the document.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/section">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-section-element">HTML Spec</a>
 */
public interface HSection extends FlowContent, PalpableContent, SectioningContent, FlowContext, FlowModel {

	@Override
	TagSection getTagType();
}
