package com.github.bordertech.webfriends.selenium.element.form.input;

import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tag.TagTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.AbstractTestElement;
import com.github.bordertech.webfriends.selenium.element.form.SLabel;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test {@link SCheckBox}.
 */
public class SCheckboxTest extends AbstractTestElement<SCheckBox> {

	@Test
	public void testNameAccessor() {
		Assert.assertEquals("Incorrect name", "testname", getTestElement().getName());
	}

	@Test
	public void testCheckedAccessor() {
		Assert.assertTrue("Incorrect checked value", getTestElement().isChecked());
	}

	@Test
	public void testRequiredAccessor() {
		Assert.assertTrue("Incorrect required value", getTestElement().isRequired());
	}

	@Test
	public void testAutofocusAccessor() {
		Assert.assertTrue("Incorrect auto focus", getTestElement().isAutofocus());
	}

	@Test
	public void testAccesskeyAccessor() {
		Assert.assertEquals("Incorrect accesskey", "A", getTestElement().getAccessKey());
	}

//	@Test
//	public void testFocus() {
//		getTestElement().focus();
//	}
	@Test
	public void testSendKey() {
		boolean current = getTestElement().isChecked();
		getTestElement().sendSpace();
		Assert.assertNotEquals("Checkbox should have been toggled with presss space", current, getTestElement().isChecked());
	}

	@Test
	public void testClick() {
		boolean current = getTestElement().isChecked();
		getTestElement().click();
		Assert.assertNotEquals("Checkbox should have toggled with click", current, getTestElement().isChecked());
	}

	@Test
	public void testClickLabel() {
		SLabel label = getDriver().findWebFriend(SeleniumTags.LABEL);
		boolean current = getTestElement().isChecked();
		label.click();
		Assert.assertNotEquals("Checkbox should have toggled with click", current, getTestElement().isChecked());
	}

	@Override
	protected TagTypeSelenium<SCheckBox> getTag() {
		return SeleniumTags.INPUT_CHECKBOX;
	}

	@Override
	protected String getElementPath() {
		return "/test/form/input/checkbox.html";
	}

}
