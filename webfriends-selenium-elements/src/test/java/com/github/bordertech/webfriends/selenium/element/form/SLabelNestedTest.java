package com.github.bordertech.webfriends.selenium.element.form;

import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.smart.by.ByLabel;
import com.github.bordertech.webfriends.selenium.element.AbstractTestElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

/**
 * Test {@link SLabel} with nested element.
 */
public class SLabelNestedTest extends AbstractTestElement<SLabel> {

	@Test
	public void testLabelTextAccessor() {
		Assert.assertEquals("Incorrect label text", "testlabel", getTestElement().getLabelText());
	}

	@Test
	public void testForIdAccessor() {
		Assert.assertNull("For id should be null for nested label", getTestElement().getForId());
	}

	@Test
	public void testNestedAccessor() {
		Assert.assertTrue("Should be true for nested element", getTestElement().isNested());
	}

	@Test
	public void testLabeledElementAccessor() {
		Assert.assertNotNull("Should have labeled element", getTestElement().getLabeledElement());
	}

	@Test
	public void testLabelByWithText() {
		WebElement element = getDriver().getWebDriver().findElement(ByLabel.text("testlabel"));
		Assert.assertNotNull("Should have found labeled element", element);
	}

	@Test
	public void testLabelByWithTextPartial() {
		WebElement element = getDriver().getWebDriver().findElement(ByLabel.text("label", true));
		Assert.assertNotNull("Should have found labeled element with partial text", element);
	}

	@Test
	public void testLabelByWithTextRelativePartial() {
		WebElement element = getDriver().getWebDriver().findElement(ByLabel.text("label", true, true));
		Assert.assertNotNull("Should have found labeled element with relative and  partial text", element);
	}

	@Override
	protected SeleniumTag<SLabel> getTag() {
		return SeleniumTags.LABEL;
	}

	@Override
	protected String getElementPath() {
		return "/test/form/labelnested.html";
	}

}
