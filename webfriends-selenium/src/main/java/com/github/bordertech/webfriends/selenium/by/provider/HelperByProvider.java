package com.github.bordertech.webfriends.selenium.by.provider;

import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

/**
 * Provider for HelperBy.
 */
public class HelperByProvider {

	private static final String XPATH_TEXT_EQUALS = "descendant-or-self::*[text()='%1$s']";
	private static final String XPATH_TEXT_CONTAINS = "descendant-or-self::*[contains(text(),'%1$s')]";
	private static final String XPATH_ATTR_CONTAINS = "contains(@%1$s,'%2$s')";
	private static final String XPATH_ATTR_EQUALS = "@%1$s='%2$s'";

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
	public List<WebElement> findElementsWithTextOptions(final SearchContext context, final SeleniumTag elementTag, final TextSearchOptions options, final boolean relative) {
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

		StringBuilder xpath = new StringBuilder();
		xpath.append("[");
		boolean appendOr = false;
		// Check node
		if (options.isCheckNodeText()) {
			String cmd = options.isPartialMatch() ? XPATH_TEXT_CONTAINS : XPATH_TEXT_EQUALS;
			xpath.append(String.format(cmd, options.getMatch()));
			appendOr = true;
		}
		// Check attributes
		if (options.isCheckAttributes()) {
			String cmd = options.isPartialMatch() ? XPATH_ATTR_CONTAINS : XPATH_ATTR_EQUALS;
			for (String attr : options.getAttributes()) {
				if (appendOr) {
					xpath.append(" or ");
				}
				xpath.append(String.format(cmd, attr, options.getMatch()));
				appendOr = true;
			}
		}
		xpath.append("]");
		return xpath.toString();
	}

}
