package com.github.bordertech.webfriends.selenium.element.document;

import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tag.TagTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.AbstractTestElement;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test {@link SHtmlRoot}.
 */
public class SHtmlRootTest extends AbstractTestElement<SHtmlRoot> {

	@Test
	public void testHeadAccessor() {
		Assert.assertNotNull("No head element", getTestElement().getHead());
	}

	@Test
	public void testBodyAccessor() {
		Assert.assertNotNull("No body element", getTestElement().getBody());
	}

	@Test
	public void testManifestUrlAccessor() {
		Assert.assertEquals("Incorrect manifest url", "testmanifest", getTestElement().getManifestUrl());
	}

	@Override
	protected TagTypeSelenium<SHtmlRoot> getTag() {
		return SeleniumTags.HTML;
	}

	@Override
	protected String getElementPath() {
		return "/test/document/root.html";
	}

}
