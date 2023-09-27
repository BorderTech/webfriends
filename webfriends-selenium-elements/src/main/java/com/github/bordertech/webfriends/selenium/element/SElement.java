package com.github.bordertech.webfriends.selenium.element;

import com.github.bordertech.webfriends.api.common.attribute.AttributeNumericToken;
import com.github.bordertech.webfriends.api.common.attribute.AttributeToken;
import com.github.bordertech.webfriends.api.element.Element;
import com.github.bordertech.webfriends.selenium.common.tag.TagTypeSelenium;
import com.github.bordertech.webfriends.selenium.smart.driver.ElementUtil;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriver;
import java.math.BigDecimal;
import java.util.List;
import org.openqa.selenium.WebElement;

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
	default String getId() {
		return getAttribute("id");
	}

	@Override
	default String getCssClass() {
		return getAttribute("class");
	}

	@Override
	default List<String> getCssClasses() {
		return getAttributeAsList("class");
	}

	@Override
	default boolean hasCssClass(final String cssClass) {
		return getCssClasses().contains(cssClass);
	}

	@Override
	default boolean isHidden() {
		return getAttributeAsBoolean("hidden");
	}

	@Override
	default String getStyle() {
		return getAttribute("style");
	}

	@Override
	default String getTitle() {
		return getAttribute("title");
	}

	/**
	 * @param key the attribute key
	 * @return the value for this attribute
	 */
	default String getAttribute(final String key) {
		return ElementUtil.getAttribute(getWebElement(), key);
	}

	/**
	 * Retrieve attribute as a boolean value.
	 *
	 * @param key the attribute name
	 * @return true if attribute is string "true" otherwise false
	 */
	default boolean getAttributeAsBoolean(final String key) {
		return ElementUtil.getAttributeAsBoolean(getWebElement(), key);
	}

	/**
	 * Retrieve attribute as an Integer value.
	 *
	 * @param key the attribute name
	 * @return integer value or null
	 */
	default Integer getAttributeAsInteger(final String key) {
		return ElementUtil.getAttributeAsInteger(getWebElement(), key);
	}

	/**
	 * Retrieve attribute as a BigDecimal value.
	 *
	 * @param key the attribute name
	 * @return big decimal value or null
	 */
	default BigDecimal getAttributeAsBigDecimal(final String key) {
		return ElementUtil.getAttributeAsBigDecimal(getWebElement(), key);
	}

	/**
	 * Retrieve attribute as a List with the default space delimiter.
	 *
	 * @param key the attribute name
	 * @return attribute value as a list
	 */
	default List<String> getAttributeAsList(final String key) {
		return ElementUtil.getAttributeAsList(getWebElement(), key);
	}

	/**
	 * Retrieve attribute as a List.
	 *
	 * @param key the attribute name
	 * @param delim the delimiter
	 * @return attribute value as a list
	 */
	default List<String> getAttributeAsList(final String key, final String delim) {
		return ElementUtil.getAttributeAsList(getWebElement(), key);
	}

	/**
	 * Find the attribute token type.
	 *
	 * @param <T> the attribute token type
	 * @param key the attribute key
	 * @param tokens the list of token types
	 * @return the token or null
	 */
	default <T extends AttributeToken> T getAttributeToken(final String key, final T[] tokens) {
		return ElementUtil.getAttributeToken(getWebElement(), key, tokens);
	}

	/**
	 * Find the attribute token numeric type.
	 *
	 * @param <T> the attribute token type
	 * @param key the attribute key
	 * @param tokens the list of token types
	 * @return the token or null
	 */
	default <T extends AttributeNumericToken> T getAttributeNumericToken(final String key, final T[] tokens) {
		return ElementUtil.getAttributeNumericToken(getWebElement(), key, tokens);
	}
}
