package com.github.bordertech.webfriends.selenium.element.textlevel;

import com.github.bordertech.webfriends.api.element.textlevel.HLinkAnchor;
import com.github.bordertech.webfriends.selenium.common.capability.FocusableSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagA;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElementSelenium;

/**
 * Selenium hyperLink element.
 */
public class SLinkAnchor extends AbstractSElement implements HLinkAnchor, ContainerElementSelenium, FocusableSelenium {

	@Override
	public STagA getTagType() {
		return SeleniumTags.A;
	}

	@Override
	public String getHref() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public String getLinkTarget() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public String getDownloadFileName() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public String getMimeType() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
