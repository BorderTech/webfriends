package com.github.bordertech.webfriends.selenium.element.embedded;

import com.github.bordertech.webfriends.api.element.embedded.HImage;
import com.github.bordertech.webfriends.selenium.common.capability.DimensionableSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagImg;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium image element.
 */
public class SImage extends AbstractSElement implements HImage, DimensionableSelenium {

	@Override
	public STagImg getTagType() {
		return SeleniumTags.IMG;
	}

	@Override
	public String getSource() {
		return getAttribute("src");
	}

	@Override
	public String getAlt() {
		return getAttribute("alt");
	}
}
