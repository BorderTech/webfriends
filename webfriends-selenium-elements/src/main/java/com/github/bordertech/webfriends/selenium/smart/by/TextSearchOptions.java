package com.github.bordertech.webfriends.selenium.smart.by;

import java.util.Collections;
import java.util.List;

/**
 * Text search options.
 */
public class TextSearchOptions {

	private final String match;
	private final boolean checkNodeText;
	private final boolean partialMatch;
	private final List<String> attributes;

	/**
	 * Check both text node and attributes with exact match.
	 *
	 * @param match the value to match
	 * @param attributes list of attributes
	 * @return the text search options
	 */
	public static TextSearchOptions both(final String match, final List<String> attributes) {
		return both(match, attributes, false);
	}

	/**
	 * Check both text node and attributes.
	 *
	 * @param match the value to match
	 * @param attributes list of attributes
	 * @param partialMatch true if partial text match
	 * @return the text search options
	 */
	public static TextSearchOptions both(final String match, final List<String> attributes, final boolean partialMatch) {
		return new TextSearchOptions(match, attributes, partialMatch, true);
	}

	/**
	 * Check the text node only (no attributes) with exact match.
	 *
	 * @param match the value to exact match
	 * @return the text search options
	 */
	public static TextSearchOptions nodeOnly(final String match) {
		return nodeOnly(match, false);
	}

	/**
	 * Check the text node only (no attributes).
	 *
	 * @param match the value to match
	 * @param partialMatch true if partial text match
	 * @return the text search options
	 */
	public static TextSearchOptions nodeOnly(final String match, final boolean partialMatch) {
		return new TextSearchOptions(match, null, partialMatch, true);
	}

	/**
	 * Check the attributes only with exact match.
	 *
	 * @param match the value to match
	 * @param attributes list of attributes
	 * @return the text search options
	 */
	public static TextSearchOptions attributesOnly(final String match, final List<String> attributes) {
		return attributesOnly(match, attributes, false);
	}

	/**
	 * Check the attributes only.
	 *
	 * @param match the value to match
	 * @param attributes list of attributes
	 * @param partialMatch true if partial text match
	 * @return the text search options
	 */
	public static TextSearchOptions attributesOnly(final String match, final List<String> attributes, final boolean partialMatch) {
		return new TextSearchOptions(match, attributes, partialMatch, false);
	}

	/**
	 * @param match the value to match
	 * @param attributes list of attributes
	 * @param partialMatch true if partial text match
	 * @param checkNodeText true if check node text
	 */
	public TextSearchOptions(final String match, final List<String> attributes, final boolean partialMatch, final boolean checkNodeText) {
		if (match == null) {
			throw new IllegalArgumentException("The text match must be provided.");
		}
		if ((attributes == null || attributes.isEmpty()) && !checkNodeText) {
			throw new IllegalArgumentException("At least a node search or attributs must be provided.");
		}
		this.match = match;
		this.attributes = attributes == null ? Collections.emptyList() : attributes;
		this.partialMatch = partialMatch;
		this.checkNodeText = checkNodeText;
	}

	/**
	 * @return the text match
	 */
	public String getMatch() {
		return match;
	}

	/**
	 * @return true if check text node
	 */
	public boolean isCheckNodeText() {
		return checkNodeText;
	}

	/**
	 * @return true if check attributes
	 */
	public boolean isCheckAttributes() {
		return !attributes.isEmpty();
	}

	/**
	 * @return true if partial match
	 */
	public boolean isPartialMatch() {
		return partialMatch;
	}

	/**
	 * @return the list of attributes
	 */
	public List<String> getAttributes() {
		return attributes;
	}

}
