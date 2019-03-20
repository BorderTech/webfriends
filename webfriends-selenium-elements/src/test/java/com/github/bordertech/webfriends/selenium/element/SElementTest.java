package com.github.bordertech.webfriends.selenium.element;

import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Test {@link AbstractSElement}.
 */
public class SElementTest extends AbstractTestElement<SElementTest.MyElement> {

	private static final SeleniumTag<MyElement> MYTAG = new MyTag();

	@Test
	public void testConstructor1() {
		AbstractSElement element = new MyElement();
		Assert.assertNull("Backing driver should be null by default", element.getDriver());
		Assert.assertNull("Backing element should be null by default", element.getWebElement());
	}

	@Test
	public void testConstructor2() {
		SmartDriver driver = getDriver();
		WebElement div = findDivElement();
		AbstractSElement element = new MyElement(driver, div);
		Assert.assertSame("Backing driver is incorrect", driver, element.getDriver());
		Assert.assertSame("Backing element is incorrect", div, element.getWebElement());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructor2Nulls() {
		new MyElement(null, null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructor2NullDriver() {
		new MyElement(null, findDivElement());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testConstructor2NullElement() {
		new MyElement(getDriver(), null);
	}

	@Test(expected = IllegalStateException.class)
	public void testConstructor2InvalidElement() {
		new MyElement(getDriver(), findSpanElement());
	}

	@Test
	public void testInit() {
		SmartDriver driver = getDriver();
		WebElement div = findDivElement();
		AbstractSElement element = new MyElement(driver, div);
		Assert.assertSame("Backing driver is incorrect", driver, element.getDriver());
		Assert.assertSame("Backing element is incorrect", div, element.getWebElement());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInitNulls() {
		new MyElement().initElement(null, null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInitNullDriver() {
		new MyElement().initElement(null, findDivElement());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInitNullElement() {
		new MyElement().initElement(getDriver(), null);
	}

	@Test(expected = IllegalStateException.class)
	public void testInitInvalidElement() {
		new MyElement().initElement(getDriver(), findSpanElement());
	}

	@Test
	public void testIdAccessor() {
		Assert.assertEquals("Incorrect id", "testid", getTestElement().getId());
	}

	@Test
	public void testHiddenAccessor() {
		Assert.assertTrue("Incorrect hidden", getTestElement().isHidden());
	}

	@Test
	public void testStyleAccessor() {
		Assert.assertEquals("Incorrect style", "color: red;", getTestElement().getStyle());
	}

	@Test
	public void testClassAccessor() {
		Assert.assertEquals("Incorrect class", "testclass1 testclass2", getTestElement().getCssClass());
	}

	@Test
	public void testClassesAccessor() {
		Assert.assertEquals("Incorrect class in list", "testclass1", getTestElement().getCssClasses().get(0));
	}

	@Override
	protected String getElementPath() {
		return "/test/element.html";
	}

	@Override
	protected SeleniumTag<MyElement> getTag() {
		return MYTAG;
	}

	private WebElement findDivElement() {
		return getDriver().getWebDriver().findElement(By.tagName("div"));
	}

	private WebElement findSpanElement() {
		return getDriver().getWebDriver().findElement(By.tagName("span"));
	}

	/**
	 * Test element.
	 */
	public static class MyElement extends AbstractSElement {

		public MyElement() {
		}

		public MyElement(final SmartDriver driver, final WebElement webElement) {
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
			return "div";
		}
	}

}
