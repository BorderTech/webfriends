package com.github.bordertech.webfriends.selenium.element.grouping;

import com.github.bordertech.webfriends.api.element.grouping.HFigure;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElement;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium figure element.
 */
public class SFigure extends AbstractSElement implements HFigure, ContainerElement {

	@Override
	public SeleniumTag<? extends SFigure> getElementTag() {
		return SeleniumTags.FIGURE;
	}

	@Override
	public String getFigureCaption() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}