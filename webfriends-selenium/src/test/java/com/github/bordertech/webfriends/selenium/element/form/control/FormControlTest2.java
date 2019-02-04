package com.github.bordertech.webfriends.selenium.element.form.control;

import com.github.bordertech.webfriends.selenium.common.form.control.FormControlSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.element.*;
import com.github.bordertech.webfriends.selenium.util.driver.FriendDriver;
import org.openqa.selenium.WebElement;

/**
 * Test {@link AbstractSElement}.
 */
public class FormControlTest2 extends AbstractTestElement<FormControlTest2.MyElement> {

	private static final SeleniumTag<MyElement> MYTAG = new MyTag();

	@Override
	protected String getElementPath() {
		return "/test/element.html";
	}

	@Override
	protected SeleniumTag<MyElement> getTag() {
		return MYTAG;
	}

	/**
	 * Test element.
	 */
	public static class MyElement extends AbstractSElement implements FormControlSelenium {

		public MyElement() {
		}

		public MyElement(final FriendDriver driver, final WebElement webElement) {
			super(driver, webElement);
		}

		@Override
		public SeleniumTag<? extends SElement> getElementTag() {
			return new MyTag();
		}

		@Override
		public void setValue(final String value) {
			throw new UnsupportedOperationException("Not supported yet.");
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
