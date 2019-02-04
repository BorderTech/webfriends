package com.github.bordertech.webfriends.selenium.element.form;

import com.github.bordertech.webfriends.api.common.capability.Autocapitalizable;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractTestElement;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test {@link SForm}.
 */
public class SFormTest extends AbstractTestElement<SForm> {

	@Test
	public void testAutocapitalizeAccessor() {
		Assert.assertEquals("Incorrect autocapitalised", Autocapitalizable.AutocapitalizeType.DEFAULT, getTestElement().getAutocapitalize());
	}

	@Test
	public void testMethodAccessor() {
		Assert.assertEquals("Incorrect method", "get", getTestElement().getMethod());
	}

	@Test
	public void testActionUrlAccessor() {
		String url = buildTestUrl("/test/form/testaction");
		Assert.assertEquals("Incorrect action", url, getTestElement().getActionUrl());
	}

	@Test
	public void testTargetAccessor() {
		Assert.assertEquals("Incorrect target", "testtarget", getTestElement().getFormTarget());
	}

	@Test
	public void testNoValidateAccessor() {
		Assert.assertTrue("Incorrect novalidate", getTestElement().isNoValidate());
	}

	@Test
	public void testNameAccessor() {
		Assert.assertEquals("Incorrect name", "testname", getTestElement().getFormName());
	}

	@Override
	protected SeleniumTag<SForm> getTag() {
		return SeleniumTags.FORM;
	}

	@Override
	protected String getElementPath() {
		return "/test/form/form.html";
	}
}
