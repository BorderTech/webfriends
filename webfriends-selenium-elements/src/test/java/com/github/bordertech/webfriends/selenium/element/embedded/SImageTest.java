package com.github.bordertech.webfriends.selenium.element.embedded;

import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractTestElement;
import org.junit.Assert;
import org.junit.Test;
import com.github.bordertech.webfriends.selenium.common.tag.TagTypeSelenium;

/**
 * Test {@link SImage}.
 */
public class SImageTest extends AbstractTestElement<SImage> {

	@Test
	public void testSourceAccessor() {
		Assert.assertTrue("Incorrect source", getTestElement().getSource().endsWith("test.png"));
	}

	@Test
	public void testWidthAccessor() {
		Assert.assertEquals("Incorrect width", 10, getTestElement().getWidth());
	}

	@Test
	public void testHeightAccessor() {
		Assert.assertEquals("Incorrect height", 20, getTestElement().getHeight());
	}

	@Test
	public void testAltAccessor() {
		Assert.assertEquals("Incorrect alt text", "testalt", getTestElement().getAlt());
	}

	@Override
	protected TagTypeSelenium<SImage> getTag() {
		return SeleniumTags.IMG;
	}

	@Override
	protected String getElementPath() {
		return "/test/embedded/image.html";
	}
}
