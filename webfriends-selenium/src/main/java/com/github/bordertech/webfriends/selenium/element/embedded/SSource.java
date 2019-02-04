package com.github.bordertech.webfriends.selenium.element.embedded;

import com.github.bordertech.webfriends.api.element.embedded.HSource;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium media source element.
 * <p>
 * Attributes srcset,sizes and media are not defined as these are used when the source element is in an img tag.
 * </p>
 */
public class SSource extends AbstractSElement implements HSource {

	@Override
	public SeleniumTag<? extends SSource> getElementTag() {
		return SeleniumTags.SOURCE;
	}

	@Override
	public String getSourceUrl() {
		return getAttribute("src");
	}

	@Override
	public String getMimeType() {
		return getAttribute("type");
	}

}
