package com.github.bordertech.webfriends.selenium.element.table;

import com.github.bordertech.webfriends.api.element.table.HCaption;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagCaption;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium Caption element.
 */
public class SCaption extends AbstractSElement implements HCaption {

	@Override
	public STagCaption getTagType() {
		return SeleniumTags.CAPTION;
	}

}
