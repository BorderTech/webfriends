package com.github.bordertech.webfriends.selenium.element.metadata;

import com.github.bordertech.webfriends.api.element.metadata.HHead;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElement;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import org.openqa.selenium.WebElement;

/**
 * Selenium head element.
 */
public class SHead extends AbstractSElement implements HHead, ContainerElement {

	@Override
	public SeleniumTag<? extends SHead> getElementTag() {
		return SeleniumTags.HEAD;
	}

	@Override
	public String getTitle() {
		WebElement title = findWebElement(SeleniumTags.TITLE);
		return title == null ? null : title.getText();
	}

}
