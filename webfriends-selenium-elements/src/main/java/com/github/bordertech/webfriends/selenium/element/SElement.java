package com.github.bordertech.webfriends.selenium.element;

import com.github.bordertech.webfriends.api.common.attribute.AttributeNumericToken;
import com.github.bordertech.webfriends.api.common.attribute.AttributeToken;
import com.github.bordertech.webfriends.api.element.Element;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriver;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartHelper;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartHelperProvider;
import java.math.BigDecimal;
import java.util.List;
import org.openqa.selenium.WebElement;
import com.github.bordertech.webfriends.selenium.common.tag.TagTypeSelenium;

/**
 * Element backed by a selenium web element and web driver.
 */
public interface SElement extends Element {

	@Override
	TagTypeSelenium getTagType();

	/**
	 * @param driver set the backing driver
	 * @param webElement set the backing web element
	 */
	void initElement(final SmartDriver driver, final WebElement webElement);

	/**
	 * @return the backing driver
	 */
	SmartDriver getDriver();

	/**
	 * @return the backing web element
	 */
	WebElement getWebElement();

	@Override
	public default String getId() {
		return getAttribute("id");
	}

	@Override
	public default String getCssClass() {
		return getAttribute("class");
	}

	@Override
	public default List<String> getCssClasses() {
		return getAttributeAsList("class");
	}

	@Override
	public default boolean hasCssClass(final String cssClass) {
		return getCssClasses().contains(cssClass);
	}

	@Override
	public default boolean isHidden() {
		return getAttributeAsBoolean("hidden");
	}

	@Override
	public default String getStyle() {
		return getAttribute("style");
	}

	@Override
	public default String getTitle() {
		return getAttribute("title");
	}

	/**
	 * @param key the attribute key
	 * @return the value for this attribute
	 */
	public default String getAttribute(final String key) {
		return getHelper().getAttribute(getWebElement(), key);
	}

	/**
	 * Retrieve attribute as a boolean value.
	 *
	 * @param key the attribute name
	 * @return true if attribute is string "true" otherwise false
	 */
	public default boolean getAttributeAsBoolean(final String key) {
		return getHelper().getAttributeAsBoolean(getWebElement(), key);
	}

	/**
	 * Retrieve attribute as an Integer value.
	 *
	 * @param key the attribute name
	 * @return integer value or null
	 */
	public default Integer getAttributeAsInteger(final String key) {
		return getHelper().getAttributeAsInteger(getWebElement(), key);
	}

	/**
	 * Retrieve attribute as a BigDecimal value.
	 *
	 * @param key the attribute name
	 * @return big decimal value or null
	 */
	public default BigDecimal getAttributeAsBigDecimal(final String key) {
		return getHelper().getAttributeAsBigDecimal(getWebElement(), key);
	}

	/**
	 * Retrieve attribute as a List with the default space delimiter.
	 *
	 * @param key the attribute name
	 * @return attribute value as a list
	 */
	public default List<String> getAttributeAsList(final String key) {
		return getHelper().getAttributeAsList(getWebElement(), key);
	}

	/**
	 * Retrieve attribute as a List.
	 *
	 * @param key the attribute name
	 * @param delim the delimiter
	 * @return attribute value as a list
	 */
	public default List<String> getAttributeAsList(final String key, final String delim) {
		return getHelper().getAttributeAsList(getWebElement(), key);
	}

	/**
	 * Find the attribute token type.
	 *
	 * @param <T> the attribute token type
	 * @param key the attribute key
	 * @param tokens the list of token types
	 * @return the token or null
	 */
	public default <T extends AttributeToken> T getAttributeToken(final String key, final T[] tokens) {
		return getHelper().getAttributeToken(getWebElement(), key, tokens);
	}

	/**
	 * Find the attribute token numeric type.
	 *
	 * @param <T> the attribute token type
	 * @param key the attribute key
	 * @param tokens the list of token types
	 * @return the token or null
	 */
	public default <T extends AttributeNumericToken> T getAttributeNumericToken(final String key, final T[] tokens) {
		return getHelper().getAttributeNumericToken(getWebElement(), key, tokens);
	}

	/**
	 * @return the web friends helper
	 */
	public default SmartHelperProvider getHelper() {
		return SmartHelper.getProvider();
	}
}
