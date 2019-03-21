package com.github.bordertech.webfriends.selenium.element.form.control;

import com.github.bordertech.webfriends.selenium.common.form.control.FormControlSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.TagTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.*;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriver;
import org.openqa.selenium.WebElement;

/**
 * Test {@link AbstractSElement}.
 */
public class FormControlTest2 extends AbstractTestElement<FormControlTest2.MyElement> {

	private static final TagTypeSelenium<MyElement> MYTAG = new MyTag();

	@Override
	protected String getElementPath() {
		return "/test/element.html";
	}

	@Override
	protected TagTypeSelenium<MyElement> getTag() {
		return MYTAG;
	}

	/**
	 * Test element.
	 */
	public static class MyElement extends AbstractSElement implements FormControlSelenium {

		public MyElement() {
		}

		public MyElement(final SmartDriver driver, final WebElement webElement) {
			super(driver, webElement);
		}

		@Override
		public TagTypeSelenium<? extends SElement> getTagType() {
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
	public static class MyTag implements TagTypeSelenium<MyElement> {

		@Override
		public Class<MyElement> getElementClass() {
			return MyElement.class;
		}

		@Override
		public String getTagName() {
			return "input";
		}
	}

}
