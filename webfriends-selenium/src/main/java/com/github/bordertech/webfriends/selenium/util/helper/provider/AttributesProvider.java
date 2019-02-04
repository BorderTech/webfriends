package com.github.bordertech.webfriends.selenium.util.helper.provider;

import com.github.bordertech.webfriends.api.common.attribute.AttributeNumericToken;
import com.github.bordertech.webfriends.api.common.attribute.AttributeToken;
import com.google.common.base.Objects;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;

/**
 * Web friends attributes provider.
 */
public interface AttributesProvider {

	/**
	 * @param element the web element
	 * @param key the attribute key to retrieve
	 * @return the attribute value or null
	 */
	public default String getAttribute(final WebElement element, final String key) {
		if (key == null || key.isEmpty()) {
			throw new IllegalArgumentException("A key attribute must be provided");
		}
		return element.getAttribute(key);
	}

	/**
	 * Retrieve attribute as a boolean value.
	 *
	 * @param element the web element
	 * @param key the attribute name
	 * @return true if attribute is string "true" otherwise false
	 */
	public default boolean getAttributeAsBoolean(final WebElement element, final String key) {
		// HTML boolean attribute is true if it is present (no matter what its value)
		String value = getAttribute(element, key);
		return value != null;
	}

	/**
	 * Retrieve attribute as an Integer value.
	 *
	 * @param element the web element
	 * @param key the attribute name
	 * @return the attribute as an integer value or null
	 */
	public default Integer getAttributeAsInteger(final WebElement element, final String key) {
		String value = getAttribute(element, key);
		return Integer.parseInt(value);
	}

	/**
	 * Retrieve attribute as a BigDecimal value.
	 *
	 * @param element the web element
	 * @param key the attribute name
	 * @return the attribute as a BigDecimal value or null
	 */
	public default BigDecimal getAttributeAsBigDecimal(final WebElement element, final String key) {
		String value = getAttribute(element, key);
		if (value == null) {
			return null;
		}
		return BigDecimal.valueOf(Double.parseDouble(value));
	}

	/**
	 * Retrieve attribute as a List with default space delimiter.
	 *
	 * @param element the web element
	 * @param key the attribute name
	 * @return attribute value as a list
	 */
	public default List<String> getAttributeAsList(final WebElement element, final String key) {
		return getAttributeAsList(element, key, " ");
	}

	/**
	 * Retrieve attribute as a List.
	 *
	 * @param element the web element
	 * @param key the attribute name
	 * @param delim the delimiter
	 * @return attribute value as a list
	 */
	public default List<String> getAttributeAsList(final WebElement element, final String key, final String delim) {
		String value = getAttribute(element, key);
		if (value == null || value.isEmpty()) {
			return Collections.EMPTY_LIST;
		}
		String[] values = value.split(delim);
		return Arrays.asList(values);
	}

	/**
	 * Find the token type.
	 *
	 * @param <T> the attribute token type
	 * @param element the web element
	 * @param key the attribute key
	 * @param tokens the list of token types
	 * @return the token or null
	 */
	public default <T extends AttributeToken> T getAttributeToken(final WebElement element, final String key, final T[] tokens) {
		if (element == null || key == null || tokens == null) {
			return null;
		}
		// Get attribute String value (null could be a valid match)
		String value = getAttribute(element, key);
		// Find matching token
		for (T token : tokens) {
			if (StringUtils.equalsIgnoreCase(token.getToken(), value)) {
				return token;
			}
		}
		return null;
	}

	/**
	 * Find the numeric token type.
	 *
	 * @param <T> the attribute token type
	 * @param element the web element
	 * @param key the attribute key
	 * @param tokens the list of token types
	 * @return the token or null
	 */
	public default <T extends AttributeNumericToken> T getAttributeNumericToken(final WebElement element, final String key, final T[] tokens) {
		if (element == null || key == null || tokens == null) {
			return null;
		}
		// Get attribute Integer value
		Integer value = getAttributeAsInteger(element, key);
		if (value == null) {
			return null;
		}
		// Find matching token
		for (T token : tokens) {
			if (Objects.equal(token.getToken(), value)) {
				return token;
			}
		}
		return null;
	}
}
