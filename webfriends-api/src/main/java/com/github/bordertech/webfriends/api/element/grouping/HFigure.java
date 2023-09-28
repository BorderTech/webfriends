package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.category.SectioningRootContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.tags.TagFigure;

/**
 * Figure element.
 * <p>
 * Model can be either: one figcaption element followed by flow content. Or: flow content followed by one figcaption
 * element. Or: flow content.
 * </p>
 */
public interface HFigure extends FlowContent, PalpableContent, SectioningRootContent,
		FlowContext,
		FlowModel {

	@Override
	TagFigure getTagType();

	/**
	 * @return the caption of the figure
	 */
	String getFigureCaption();

}
