package com.github.bordertech.webfriends.selenium.util.helper.provider;

import com.github.bordertech.didums.Factory;
import com.github.bordertech.webfriends.api.common.tag.Qualifier;
import com.github.bordertech.webfriends.selenium.capability.ContainerElement;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.SElement;
import com.github.bordertech.webfriends.selenium.util.driver.FriendDriver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;

/**
 * Element utility provider.
 */
public interface ElementUtilProvider extends AttributesProvider {

	String XPATH_QUAL_HAS = "[@%1$s]";
	String XPATH_QUAL_CONTAINS = "[contains(@%1$s,'%2$s')]";
	String XPATH_QUAL_EQUALS = "[@%1$s='%2$s']";

	/**
	 * Applications can override this to add custom tags.
	 *
	 * @param tagName the tag name
	 * @return the tag types that match the tag name
	 */
	public default List<SeleniumTag> getElementTags(final String tagName) {
		return SeleniumTags.HTML_TAG_MAP.get(tagName);
	}

	/**
	 * Check if element is a container.
	 *
	 * @param webElement the web element
	 * @return true if is a container element
	 */
	public default boolean isElementContainer(final WebElement webElement) {
		SeleniumTag tag = getElementTag(webElement);
		if (tag == null) {
			return false;
		}
		// TODO Check this works
		return isInterface(tag.getTagClass(), ContainerElement.class);
	}

	/**
	 * Check if element is a container.
	 *
	 * @param element the web friend element
	 * @return true if is a container element
	 */
	public default boolean isElementContainer(final SElement element) {
		// TODO More efficent way of doing this. Maybe put a boolean flag on the element tag interface
		return element instanceof ContainerElement;
	}

	/**
	 * Check if the web element is web friend compatible
	 *
	 * @param webElement the web element
	 * @return true if web element is a compatible web friend element
	 */
	public default boolean isWebFriendCompatible(final WebElement webElement) {
		return getElementTag(webElement) != null;
	}

	/**
	 * Get the tag type for this web element.
	 *
	 * @param webElement the web element
	 * @return the element tag for this web element, or null if no match
	 */
	public default SeleniumTag getElementTag(final WebElement webElement) {
		// Get element tags that match tag name
		List<SeleniumTag> tags = getElementTags(webElement.getTagName());
		// Check Qualifiers
		SeleniumTag matchElement = null;
		int matchQualifiers = -1;
		for (SeleniumTag tag : tags) {
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
	public default boolean isElementMatch(final WebElement webElement, final SeleniumTag<?> tag) {
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
	public default SElement wrapWebElement(final FriendDriver driver, final WebElement webElement) {
		// Get element tag type
		SeleniumTag tag = getElementTag(webElement);
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
	public default <T extends SElement> List<T> wrapWebElements(final FriendDriver driver, final List<WebElement> webElements, final SeleniumTag<T> elementTag) {
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
	public default <T extends SElement> T wrapWebElementNth(final FriendDriver driver, final List<WebElement> webElements, final SeleniumTag<T> elementTag, final int idx) {
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
	public default List<WebElement> filterWebElements(final List<WebElement> webElements, final SeleniumTag elementTag) {
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
	public default WebElement filterWebElementsNth(final List<WebElement> webElements, final SeleniumTag elementTag, final int idx) {
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
	public default <T extends SElement> T wrapWebElement(final FriendDriver driver, final WebElement webElement, final SeleniumTag<T> elementTag) {
		if (driver == null) {
			throw new IllegalArgumentException("Driver must be provided.");
		}
		if (webElement == null) {
			throw new IllegalArgumentException("Web element must be provided.");
		}
		T element = Factory.newInstance(elementTag.getTagClass(), elementTag.getTagClass());
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
	public default boolean isInterface(final Class clazz, final Class type) {
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
	public default String buildElementQualifierXpath(final String tag, final List<Qualifier> qualifiers, final boolean relative) {
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
				}
				select.append(cond);
			}
		}
		return select.toString();
	}
}
