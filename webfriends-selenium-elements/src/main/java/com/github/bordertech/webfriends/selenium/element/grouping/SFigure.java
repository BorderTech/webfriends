package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HFigure;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithButtons;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithChildren;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagFigure;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium figure element.
 */
public class SFigure extends AbstractSElement implements HFigure,
		ContainerWithChildren, ContainerWithButtons {

	@Override
	public STagFigure getTagType() {
		return SeleniumTags.FIGURE;
	}

	@Override
	public String getFigureCaption() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
