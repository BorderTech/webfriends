package com.github.bordertech.webfriends.selenium.element.document;

import com.github.bordertech.webfriends.api.element.document.HHtmlRoot;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElement;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.element.metadata.SHead;
import com.github.bordertech.webfriends.selenium.element.sections.SBody;

/**
 * Selenium HTML root element.
 */
public class SHtmlRoot extends AbstractSElement implements HHtmlRoot, ContainerElement {

	private SHead head = null;
	private SBody body = null;

	@Override
	public SeleniumTag<? extends SHtmlRoot> getElementTag() {
		return SeleniumTags.HTML;
	}

	@Override
	public String getManifestUrl() {
		return getAttribute("manifest");
	}

	@Override
	public SHead getHead() {
		if (head == null) {
			head = findWebFriend(SeleniumTags.HEAD);
		}
		return head;
	}

	@Override
	public SBody getBody() {
		if (body == null) {
			body = findWebFriend(SeleniumTags.BODY);
		}
		return body;
	}

}
