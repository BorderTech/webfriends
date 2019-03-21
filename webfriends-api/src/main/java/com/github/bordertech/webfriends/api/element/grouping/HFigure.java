package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.category.SectioningRoot;
import com.github.bordertech.webfriends.api.common.combo.FlowPalpableElement;
import com.github.bordertech.webfriends.api.common.tags.TagFigure;

/**
 * Figure element.
 * <p>
 * Model can be either: one figcaption element followed by flow content. Or: flow content followed by one figcaption
 * element. Or: flow content.
 * </p>
 */
public interface HFigure extends FlowPalpableElement, SectioningRoot {

	@Override
	TagFigure getTagType();

	/**
	 * @return the caption of the figure
	 */
	String getFigureCaption();

}
