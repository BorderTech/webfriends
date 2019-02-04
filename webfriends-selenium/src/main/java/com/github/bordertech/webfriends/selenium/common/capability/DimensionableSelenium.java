package com.github.bordertech.webfriends.selenium.common.capability;

import com.github.bordertech.webfriends.api.common.capability.Dimensionable;
import com.github.bordertech.webfriends.selenium.element.SElement;
import org.openqa.selenium.Dimension;

/**
 * Element with dimensions.
 */
public interface DimensionableSelenium extends Dimensionable, SElement {

	@Override
	public default int getWidth() {
		// TODO Is this the right way to get this value? Or get as attribute?
		Dimension size = getWebElement().getSize();
		return size == null ? -1 : size.getWidth();
	}

	@Override
	public default int getHeight() {
		// TODO Is this the right way to get this value? Or get as attribute?
		Dimension size = getWebElement().getSize();
		return size == null ? -1 : size.getHeight();
	}

}
