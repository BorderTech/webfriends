package com.github.bordertech.webfriends.selenium.smart.driver;

import com.github.bordertech.didums.Didums;
import com.github.bordertech.webfriends.api.common.attribute.AttributeNumericToken;
import com.github.bordertech.webfriends.api.common.attribute.AttributeToken;
import com.github.bordertech.webfriends.api.common.tag.Qualifier;
import com.github.bordertech.webfriends.selenium.common.category.LabelableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.category.FormAssociatedSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tag.TagHeadingTypeSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.TagTypeSelenium;
import com.github.bordertech.webfriends.selenium.element.SElement;
import com.github.bordertech.webfriends.selenium.element.form.SButton;
import com.github.bordertech.webfriends.selenium.element.form.SForm;
import com.github.bordertech.webfriends.selenium.element.sections.HeadingElementSelenium;
import com.github.bordertech.webfriends.selenium.smart.by.ByDesc;
import com.github.bordertech.webfriends.selenium.smart.by.ByLabel;
import com.github.bordertech.webfriends.selenium.smart.by.TextSearchOptions;
import com.github.bordertech.webfriends.selenium.util.driver.HelperProvider;
import com.github.bordertech.webfriends.selenium.util.driver.type.WebDriverType;
import com.google.common.base.Objects;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithChildren;

/**
 * Smart elements helper provider.
 */
public class SmartHelperProvider extends HelperProvider {

	private static final String XPATH_TEXT_EQUALS = "descendant-or-self::*[text()='%1$s']";
	private static final String XPATH_TEXT_CONTAINS = "descendant-or-self::*[contains(text(),'%1$s')]";
	private static final String XPATH_ATTR_CONTAINS = "contains(@%1$s,'%2$s')";
	private static final String XPATH_ATTR_EQUALS = "@%1$s='%2$s'";
	private static final String XPATH_QUAL_HAS = "[@%1$s]";
	private static final String XPATH_QUAL_CONTAINS = "[contains(@%1$s,'%2$s')]";
	private static final String XPATH_QUAL_EQUALS = "[@%1$s='%2$s']";

	@Override
	public SmartDriver createDriverInstance(final WebDriver webDriver) {
		return (SmartDriver) super.createDriverInstance(webDriver);
	}

	@Override
	public SmartDriver createDriverInstance(final WebDriverType driverType) {
		return (SmartDriver) super.createDriverInstance(driverType);
	}

	@Override
	protected SmartDriver createDefaultDriver() {
		return new SmartDriver();
	}

	/**
	 * Applications can override this to add custom tags.
	 *
	 * @param tagName the tag name
	 * @return the tag types that match the tag name
	 */
	public List<TagTypeSelenium> getElementTags(final String tagName) {
		return SeleniumTags.getTagsMap().get(tagName);
	}

	/**
	 * Check if element is a container.
	 *
	 * @param webElement the web element
	 * @return true if is a container element
	 */
	public boolean isElementContainer(final WebElement webElement) {
		TagTypeSelenium tag = getElementTag(webElement);
		if (tag == null) {
			return false;
		}
		// TODO Check this works
		return isInterface(tag.getElementClass(), ContainerWithChildren.class);
	}

	/**
	 * Check if element is a container.
	 *
	 * @param element the web friend element
	 * @return true if is a container element
	 */
	public boolean isElementContainer(final SElement element) {
		// TODO More efficent way of doing this. Maybe put a boolean flag on the element tag interface
		return element instanceof ContainerWithChildren;
	}

	/**
	 * Check if the web element is web friend compatible
	 *
	 * @param webElement the web element
	 * @return true if web element is a compatible web friend element
	 */
	public boolean isWebFriendCompatible(final WebElement webElement) {
		return getElementTag(webElement) != null;
	}

	/**
	 * Get the tag type for this web element.
	 *
	 * @param webElement the web element
	 * @return the element tag for this web element, or null if no match
	 */
	public TagTypeSelenium getElementTag(final WebElement webElement) {
		// Get element tags that match tag name
		List<TagTypeSelenium> tags = getElementTags(webElement.getTagName());
		// Check Qualifiers
		TagTypeSelenium matchElement = null;
		int matchQualifiers = -1;
		for (TagTypeSelenium tag : tags) {
			if (tag.getQualifiers().size() > matchQualifiers && isElementMatch(webElement, tag)) {
				matchElement = tag;
				matchQualifiers = tag.getQualifiers().size();
			}
		}
		return matchElement;
	}

	/**
	 * Check if web element and tag type are a match.
	 *
	 * @param webElement the web element to check
	 * @param tag the element tag to check
	 * @return true if we element and element tag match
	 */
	public boolean isElementMatch(final WebElement webElement, final TagTypeSelenium<?> tag) {
		// Check tag name
		if (!tag.getTagName().equalsIgnoreCase(webElement.getTagName())) {
			return false;
		}
		// Check qualifiers (ignore case)
		for (Qualifier qual : tag.getQualifiers()) {
			// Attribute value
			String attrValue = webElement.getAttribute(qual.getKey());
			// Check condition
			switch (qual.getPredicate()) {
				case HAS:
					// Has attribute
					if (attrValue == null) {
						return false;
					}
					break;
				case CONTAINS:
					// Contains value
					if (!StringUtils.containsIgnoreCase(attrValue, qual.getValue())) {
						return false;
					}
					break;
				default:
					// Equals value
					if (!StringUtils.equalsIgnoreCase(attrValue, qual.getValue())) {
						return false;
					}
			}
		}
		return true;
	}

	/**
	 * Wrap the web element if it is compatible.
	 *
	 * @param driver the web driver
	 * @param webElement the web element to wrap
	 * @return the web friend wrapper element, or null if not a compatible web friend element
	 */
	public SElement wrapWebElement(final SmartDriver driver, final WebElement webElement) {
		// Get element tag type
		TagTypeSelenium tag = getElementTag(webElement);
		if (tag == null) {
			return null;
		}
		return wrapWebElement(driver, webElement, tag);
	}

	/**
	 * Filter and wrap web elements with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param webElements the web element
	 * @param elementTag the element tag to wrap element with
	 * @return the list of web friend elements
	 */
	public <T extends SElement> List<T> wrapWebElements(final SmartDriver driver, final List<WebElement> webElements, final TagTypeSelenium<T> elementTag) {
		if (webElements == null || webElements.isEmpty()) {
			return Collections.emptyList();
		}
		// Get elements for this tag type
		List<WebElement> filtered = filterWebElements(webElements, elementTag);
		// Wrap the elements
		List<T> wrapped = new ArrayList<>();
		for (WebElement webElement : filtered) {
			wrapped.add(wrapWebElement(driver, webElement, elementTag));
		}
		return wrapped;
	}

	/**
	 * Filter and wrap web the nth element with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param webElements the web element
	 * @param elementTag the element tag to wrap element with
	 * @param idx the nth element (starting at 1)
	 * @return the web friend element or null if no match
	 */
	public <T extends SElement> T wrapWebElementNth(final SmartDriver driver, final List<WebElement> webElements, final TagTypeSelenium<T> elementTag, final int idx) {
		if (webElements == null || webElements.isEmpty()) {
			return null;
		}
		// Get the nth element that matches this tag type
		WebElement element = filterWebElementsNth(webElements, elementTag, idx);
		// Wrap the element
		return element == null ? null : wrapWebElement(driver, element, elementTag);
	}

	/**
	 * Filter web elements with this tag type (without wrapping).
	 *
	 * @param webElements the web elements
	 * @param elementTag the element tag to match elements
	 * @return the list of elements for this tag type
	 */
	public List<WebElement> filterWebElements(final List<WebElement> webElements, final TagTypeSelenium elementTag) {
		if (webElements == null || webElements.isEmpty()) {
			return Collections.emptyList();
		}
		// Find elements that match this type
		List<WebElement> matches = new ArrayList<>();
		for (WebElement webElement : webElements) {
			if (isElementMatch(webElement, elementTag)) {
				matches.add(webElement);
			}
		}
		return matches;
	}

	/**
	 * Find the nth (starting at 1) child element with this tag type.
	 *
	 * @param webElements the web elements
	 * @param elementTag the element tag
	 * @param idx the nth element (starting at 1)
	 * @return the nth element of this tag type
	 */
	public WebElement filterWebElementsNth(final List<WebElement> webElements, final TagTypeSelenium elementTag, final int idx) {
		if (webElements == null || webElements.isEmpty()) {
			return null;
		}
		// First of all find the matching elements
		List<WebElement> filtered = filterWebElements(webElements, elementTag);
		// Get the nth element
		int offset = idx - 1;
		return filtered.size() > offset ? filtered.get(offset) : null;
	}

	/**
	 * Wrap the web element with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param webElement the web element
	 * @param elementTag the element tag to wrap element with
	 * @return the web friend element for this web element
	 */
	public <T extends SElement> T wrapWebElement(final SmartDriver driver, final WebElement webElement, final TagTypeSelenium<T> elementTag) {
		if (driver == null) {
			throw new IllegalArgumentException("Driver must be provided.");
		}
		if (webElement == null) {
			throw new IllegalArgumentException("Web element must be provided.");
		}
		T element = Didums.getService(elementTag.getElementClass(), elementTag.getElementClass());
		element.initElement(driver, webElement);
		return element;
	}

	/**
	 * Check if a Class implements an interface.
	 *
	 * @param clazz the class to check has the interface
	 * @param type the interface class
	 * @return true if class has interface
	 */
	public boolean isInterface(final Class clazz, final Class type) {
		if (clazz == null || type == null) {
			return false;
		}
		return type.isAssignableFrom(clazz);
	}

	/**
	 * Build the XPATH for a element with qualifiers.
	 *
	 * @param tag the element tag
	 * @param qualifiers the qualifiers
	 * @param relative true if relative search
	 * @return the XPATH for the tag type
	 */
	public String buildElementQualifierXpath(final String tag, final List<Qualifier> qualifiers, final boolean relative) {
		StringBuilder select = new StringBuilder();
		if (relative) {
			// From current node
			select.append(".");
		}
		select.append("//");
		// Tag name
		select.append(tag);
		// Qualifiers
		if (qualifiers != null) {
			for (Qualifier qual : qualifiers) {
				String cond;
				switch (qual.getPredicate()) {
					case HAS:
						// Has attribute
						cond = String.format(XPATH_QUAL_HAS, qual.getKey());
						break;
					case CONTAINS:
						// Contains value
						cond = String.format(XPATH_QUAL_CONTAINS, qual.getKey(), qual.getValue());
						break;
					default:
						// Equals value
						cond = String.format(XPATH_QUAL_EQUALS, qual.getKey(), qual.getValue());
						break;
				}
				select.append(cond);
			}
		}
		return select.toString();
	}

	/**
	 * Set focus to this element.
	 *
	 * @param driver the driver
	 * @param element the element to focus
	 */
	public void setFocus(final SmartDriver driver, final SElement element) {
		setFocus(driver, element.getWebElement());
	}

	/**
	 * @param element the web element
	 * @param key the attribute key to retrieve
	 * @return the attribute value or null
	 */
	public String getAttribute(final WebElement element, final String key) {
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
	public boolean getAttributeAsBoolean(final WebElement element, final String key) {
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
	public Integer getAttributeAsInteger(final WebElement element, final String key) {
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
	public BigDecimal getAttributeAsBigDecimal(final WebElement element, final String key) {
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
	public List<String> getAttributeAsList(final WebElement element, final String key) {
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
	public List<String> getAttributeAsList(final WebElement element, final String key, final String delim) {
		String value = getAttribute(element, key);
		if (value == null || value.isEmpty()) {
			return Collections.emptyList();
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
	public <T extends AttributeToken> T getAttributeToken(final WebElement element, final String key, final T[] tokens) {
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
	public <T extends AttributeNumericToken> T getAttributeNumericToken(final WebElement element, final String key, final T[] tokens) {
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

	/**
	 * Find the first child heading element (H1 to H6).
	 *
	 * @param driver the web driver
	 * @param context the search context
	 * @return the heading element or null
	 */
	public HeadingElementSelenium findHeading(final SmartDriver driver, final SearchContext context) {
		// TODO Maybe switch this to a xpath
		// Check for H1 to H6
		for (TagHeadingTypeSelenium<? extends HeadingElementSelenium> tag : SeleniumTags.getHeadingTags()) {
			HeadingElementSelenium heading = findWebFriend(driver, context, tag);
			if (heading != null) {
				return heading;
			}
		}
		return null;
	}

	/**
	 * Find the first button with the matching text.
	 *
	 * @param driver the web driver
	 * @param context the search context
	 * @param partial true if partial
	 * @param text the text of the button
	 * @return the button element or null
	 */
	public SButton findButton(final SmartDriver driver, final SearchContext context, final String text, final boolean partial) {
		By by = ByDesc.text(SeleniumTags.BUTTON, text, partial, true);
		return findWebFriend(driver, context, SeleniumTags.BUTTON, by);
	}

	/**
	 * Find the first labeled element with the matching text.
	 *
	 * @param <T> the element tag type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param text the text of the button
	 * @param partial true if partial match
	 * @return the labeled element or null
	 */
	public <T extends LabelableSelenium> T findLabeled(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final String text, final boolean partial) {
		By by = ByLabel.text(text, partial, true);
		return findWebFriend(driver, context, elementTag, by);
	}

	/**
	 * Find the first element with the tag type and exact text.
	 *
	 * @param <T> the element tag type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param text the text of the button
	 * @return the labeled element or null
	 */
	public <T extends SElement> T findWithText(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final String text) {
		return findWithText(driver, context, elementTag, text, true);
	}

	/**
	 * Find the first element with the tag type and matching text.
	 *
	 * @param <T> the element tag type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param text the text of the button
	 * @param partial true if partial match
	 * @return the labeled element or null
	 */
	public <T extends SElement> T findWithText(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final String text, final boolean partial) {
		By by = ByDesc.text(elementTag, text, partial, true);
		return findWebFriend(driver, context, elementTag, by);
	}

	/**
	 * Find the first child element (ie relative) with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> T findWebFriend(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag) {
		return findWebFriend(driver, context, elementTag, true);
	}

	/**
	 * Find the first element with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param relative true if relative
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> T findWebFriend(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final boolean relative) {
		return findWebFriendNth(driver, context, elementTag, 1, relative);
	}

	/**
	 * Find the first child element with this Tag Type and By (the By determines relative or root).
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param by the by condition which determines relative or root
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> T findWebFriend(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final By by) {
		return findWebFriendNth(driver, context, elementTag, by, 1);
	}

	/**
	 * Find the nth (starting at 1) child element (ie relative) with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param idx the nth element (starting at 1)
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> T findWebFriendNth(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final int idx) {
		return findWebFriendNth(driver, context, elementTag, idx, true);
	}

	/**
	 * Find the nth (starting at 1) element with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param relative true if relative
	 * @param idx the nth element (starting at 1)
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> T findWebFriendNth(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final int idx, final boolean relative) {
		WebElement element = findWebElementNth(context, elementTag, idx, relative);
		return element == null ? null : wrapWebElement(driver, element, elementTag);
	}

	/**
	 * Find the nth (starting at 1) element with this tag type and By (the By determines relative or root).
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param by the by condition which determines relative or root
	 * @param idx the nth element (starting at 1)
	 * @return the web friend wrapper for the matching element, or null if no match
	 */
	public <T extends SElement> T findWebFriendNth(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final By by, final int idx) {
		WebElement element = findWebElementNth(context, elementTag, by, idx);
		return element == null ? null : wrapWebElement(driver, element, elementTag);
	}

	/**
	 * Find the child elements (ie relative) with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @return the web friend wrappers for the matching element
	 */
	public <T extends SElement> List<T> findWebFriends(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag) {
		return findWebFriends(driver, context, elementTag, true);
	}

	/**
	 * Find the child elements with this tag type.
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param relative true if relative
	 * @return the web friend wrappers for the matching elements
	 */
	public <T extends SElement> List<T> findWebFriends(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final boolean relative) {
		List<WebElement> elements = findWebElements(context, elementTag, relative);
		return wrapWebElements(driver, elements, elementTag);
	}

	/**
	 * Find the child elements with this tag type and By (the By determine relative or root).
	 *
	 * @param <T> the web friends element type
	 * @param driver the web driver
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param by the BY condition which determines relative or root
	 * @return the web friend wrappers for the matching element
	 */
	public <T extends SElement> List<T> findWebFriends(final SmartDriver driver, final SearchContext context, final TagTypeSelenium<T> elementTag, final By by) {
		List<WebElement> elements = findWebElements(context, elementTag, by);
		return wrapWebElements(driver, elements, elementTag);
	}

	/**
	 * Find the elements associated with this form.
	 *
	 * @param form the parent form
	 * @return the form associated elements
	 */
	public List<FormAssociatedSelenium> getFormAssociated(final SForm form) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Find the first child element (ie relative) for a tag type.
	 *
	 * @param context the search context.
	 * @param elementTag the element tag
	 * @return the matching element or null
	 */
	public WebElement findWebElement(final SearchContext context, final TagTypeSelenium elementTag) {
		return findWebElement(context, elementTag, true);
	}

	/**
	 * Find the first element for a tag type.
	 *
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param relative true if relative search
	 * @return the matching element or null
	 */
	public WebElement findWebElement(final SearchContext context, final TagTypeSelenium elementTag, final boolean relative) {
		return findWebElementNth(context, elementTag, 1, relative);
	}

	/**
	 * Find the first element for a tag type and By (the By determines relative or root).
	 *
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param by the by condition which determines relative or root
	 * @return the matching element or null
	 */
	public WebElement findWebElement(final SearchContext context, final TagTypeSelenium elementTag, final By by) {
		return findWebElementNth(context, elementTag, by, 1);
	}

	/**
	 * Find the nth child element (ie relative) for a tag type.
	 *
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param idx the nth (starting from 1) child element
	 * @return the matching element or null
	 */
	public WebElement findWebElementNth(final SearchContext context, final TagTypeSelenium elementTag, final int idx) {
		return findWebElementNth(context, elementTag, idx, true);
	}

	/**
	 * Find the nth element for a tag type.
	 *
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param idx the nth (starting from 1) child element
	 * @param relative true if relative search
	 * @return the matching element or null
	 */
	public WebElement findWebElementNth(final SearchContext context, final TagTypeSelenium elementTag, final int idx, final boolean relative) {
		List<WebElement> elements = findWebElements(context, elementTag, relative);
		return filterWebElementsNth(elements, elementTag, idx);
	}

	/**
	 * Find the nth element for a tag type and By (the By determines relative or root).
	 *
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param by the by condition which determines relative or root
	 * @param idx the nth (starting from 1) child element
	 * @return the matching element or null
	 */
	public WebElement findWebElementNth(final SearchContext context, final TagTypeSelenium elementTag, final By by, final int idx) {
		List<WebElement> elements = findWebElements(context, elementTag, by);
		return filterWebElementsNth(elements, elementTag, idx);
	}

	/**
	 * Find the child elements (ie relative) for tag type.
	 *
	 * @param context the search context
	 * @param elementTag the element tag
	 * @return the matching elements
	 */
	public List<WebElement> findWebElements(final SearchContext context, final TagTypeSelenium elementTag) {
		return findWebElements(context, elementTag, true);
	}

	/**
	 * Find the elements for tag type.
	 *
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param relative true if relative search
	 * @return the matching elements
	 */
	public List<WebElement> findWebElements(final SearchContext context, final TagTypeSelenium elementTag, final boolean relative) {
		By by = buildSeleniumTabBy(elementTag, relative);
		return context.findElements(by);
	}

	/**
	 * Find the elements for tag type and By (the By determines relative or root).
	 *
	 * @param context the search context
	 * @param elementTag the element tag
	 * @param by the by condition which determines relative or root
	 * @return the matching elements
	 */
	public List<WebElement> findWebElements(final SearchContext context, final TagTypeSelenium elementTag, final By by) {
		List<WebElement> elements = context.findElements(by);
		return filterWebElements(elements, elementTag);
	}

	/**
	 * Build the BY for a tag type.
	 *
	 * @param tag the element tag
	 * @param relative true if relative search
	 * @return the BY for the element
	 */
	public By buildSeleniumTabBy(final TagTypeSelenium<?> tag, final boolean relative) {
		return By.xpath(tag.getXPath(relative));
	}

	/**
	 * Find the elements labeled by this text.
	 *
	 * @param context the search context
	 * @param labelText the text used to find the label
	 * @param partialMatch whether it can be a partial text match
	 * @param relative whether to use a relative xpath lookup
	 * @return the elements labeled by this text
	 */
	public List<WebElement> findLabeledElementsWithText(final SearchContext context, final String labelText, final boolean partialMatch, final boolean relative) {
		List<WebElement> labels = findLabelElements(context, labelText, partialMatch, relative);
		return findLabeledElementsWithLabels(labels);
	}

	/**
	 * Find the element labeled by a label element.
	 *
	 * @param label the label element
	 * @return the element labeled by the label, or null
	 */
	public WebElement findLabeledElementWithLabel(final WebElement label) {

		// Check label provided
		if (label == null) {
			return null;
		}

		// Check label tag
		if (!"label".equalsIgnoreCase(label.getTagName())) {
			return null;
		}

		// Find the FOR element (if has one)
		String elementId = label.getAttribute("for");
		if (!StringUtils.isEmpty(elementId)) {
			// Must use absolute asFOR element could be anywhere on the page (CSS selector doesnot work???)
			return label.findElement(By.xpath("//*[@id='" + elementId + "']"));
		}

		// No FOR, so check for nested labelled element
		WebElement nestedElement = label.findElement(By.tagName("input"));
		if (nestedElement == null) {
			nestedElement = label.findElement(By.tagName("select"));
		}
		if (nestedElement == null) {
			nestedElement = label.findElement(By.tagName("textarea"));
		}
		// if still null have probably picked up a non-label span element.
		return nestedElement;
	}

	/**
	 * Find the elements labeled by label elements.
	 *
	 * @param labels the label elements
	 * @return the elements labeled by this text
	 */
	public List<WebElement> findLabeledElementsWithLabels(final List<WebElement> labels) {

		// Checks labels have been provided
		if (labels == null || CollectionUtils.isEmpty(labels)) {
			return Collections.emptyList();
		}

		// Find labeled elements
		List<WebElement> results = new ArrayList<>();
		for (WebElement label : labels) {
			WebElement labeled = findLabeledElementWithLabel(label);
			if (labeled != null) {
				results.add(labeled);
			}
		}
		return results;
	}

	/**
	 * Find label elements by its text, either as an exact or partial match and using a relative XPATH.
	 *
	 * @param context the search context
	 * @param labelText the text used to find the label
	 * @param partialMatch whether it can be a partial text match
	 * @param relative whether to use a relative xpath lookup
	 * @return the elements labeled by this text
	 */
	public List<WebElement> findLabelElements(final SearchContext context, final String labelText, final boolean partialMatch, final boolean relative) {
		TextSearchOptions options = TextSearchOptions.nodeOnly(labelText, partialMatch);
		return findElementsWithTextOptions(context, SeleniumTags.LABEL, options, relative);
	}

	/**
	 * Search for an element with text search options.
	 *
	 * @param context the search context
	 * @param options the text search options
	 * @param relative true if relative search
	 * @return the list of matching elements
	 */
	public List<WebElement> findElementsWithTextOptions(final SearchContext context, final TextSearchOptions options, final boolean relative) {
		String prefix = relative ? ".//*" : "//*";
		String textX = buildTextOptionsXPathFilter(options);
		return context.findElements(By.xpath(prefix + textX));
	}

	/**
	 * Search for an element with a tag type and text search options.
	 *
	 * @param context the search context
	 * @param elementTag the optional tag to search
	 * @param options the text search options
	 * @param relative true if relative search
	 * @return the list of matching elements
	 */
	public List<WebElement> findElementsWithTextOptions(final SearchContext context, final TagTypeSelenium elementTag, final TextSearchOptions options, final boolean relative) {
		String prefix = elementTag.getXPath(relative);
		String textX = buildTextOptionsXPathFilter(options);
		return context.findElements(By.xpath(prefix + textX));
	}

	/**
	 * Build the XPATH for text search filter where each attribute is a "OR" value.
	 *
	 * @param options the text search options
	 * @return the XPATH for text options filter
	 */
	public String buildTextOptionsXPathFilter(final TextSearchOptions options) {

		if (!options.isCheckNodeText() && !options.isCheckAttributes()) {
			return "";
		}

		// Build options
		StringBuilder xpathOpt = new StringBuilder();
		// Check node
		if (options.isCheckNodeText()) {
			handleCheckNodeText(xpathOpt, options);
		}
		// Check attributes
		if (options.isCheckAttributes()) {
			handleCheckNodeAttributes(xpathOpt, options);
		}

		// Build xpath
		StringBuilder xpath = new StringBuilder();
		xpath.append("[").append(xpathOpt).append("]");
		return xpath.toString();
	}

	/**
	 * Handle XPATH for node text.
	 *
	 * @param xpath the XPATH being built
	 * @param options the text search options
	 */
	protected void handleCheckNodeText(final StringBuilder xpath, final TextSearchOptions options) {
		if (xpath.length() > 0) {
			xpath.append(" or ");
		}
		String cmd = options.isPartialMatch() ? XPATH_TEXT_CONTAINS : XPATH_TEXT_EQUALS;
		xpath.append(String.format(cmd, options.getMatch()));
	}

	/**
	 * Handle XPATH for attributes text.
	 *
	 * @param xpath the XPATH being built
	 * @param options the text search options
	 */
	protected void handleCheckNodeAttributes(final StringBuilder xpath, final TextSearchOptions options) {
		String cmd = options.isPartialMatch() ? XPATH_ATTR_CONTAINS : XPATH_ATTR_EQUALS;
		for (String attr : options.getAttributes()) {
			if (xpath.length() > 0) {
				xpath.append(" or ");
			}
			xpath.append(String.format(cmd, attr, options.getMatch()));
		}
	}

}
