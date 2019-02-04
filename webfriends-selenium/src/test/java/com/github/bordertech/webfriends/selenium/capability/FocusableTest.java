package com.github.bordertech.webfriends.selenium.capability;

import com.github.bordertech.webfriends.api.common.capability.Focusable;
import com.github.bordertech.webfriends.selenium.common.capability.FocusableSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.element.*;
import com.github.bordertech.webfriends.selenium.util.driver.FriendDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

/**
 * Test {@link FocusableSelenium}.
 */
public class FocusableTest extends AbstractTestElement<FocusableTest.MyElement> {

	private static final SeleniumTag<MyElement> MYTAG = new MyTag();

	@Test
	public void testAccessKeyAccessor() {
		Assert.assertEquals("Incorrect accessskey", "A", getTestElement().getAccessKey());
	}

	@Test
	public void testTabIndexValueAccessor() {
		Assert.assertEquals("Incorrect tab index value", Integer.valueOf(0), getTestElement().getTabIndexValue());
	}

	@Test
	public void testTabIndexAccessor() {
		Assert.assertEquals("Incorrect tab index", Focusable.TabIndexType.ON, getTestElement().getTabIndex());
	}

	@Override
	protected String getElementPath() {
		return "/test/common/capability/focusable.html";
	}

	@Override
	protected SeleniumTag<MyElement> getTag() {
		return MYTAG;
	}

	/**
	 * Test element.
	 */
	public static class MyElement extends AbstractSElement implements FocusableSelenium {

		public MyElement() {
		}

		public MyElement(final FriendDriver driver, final WebElement webElement) {
			super(driver, webElement);
		}

		@Override
		public SeleniumTag<? extends SElement> getElementTag() {
			return new MyTag();
		}
	}

	/**
	 * Test tag.
	 */
	public static class MyTag implements SeleniumTag<MyElement> {

		@Override
		public Class<MyElement> getTagClass() {
			return MyElement.class;
		}

		@Override
		public String getTagName() {
			return "input";
		}
	}

}
