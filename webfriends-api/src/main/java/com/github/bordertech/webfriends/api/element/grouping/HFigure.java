package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.tags.TagFigure;

/**
 * Figure element.
 * <p>
 * Model can be either: one figcaption element followed by flow content. Or: flow content followed by one figcaption element. Or: flow content.
 * </p>
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/figure">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-figure-element">HTML Spec</a>
 */
public interface HFigure extends FlowContent, PalpableContent,
		FlowContext,
		FlowModel {

	@Override
	TagFigure getTagType();

	/**
	 * @return the caption of the figure
	 */
	String getFigureCaption();

}
