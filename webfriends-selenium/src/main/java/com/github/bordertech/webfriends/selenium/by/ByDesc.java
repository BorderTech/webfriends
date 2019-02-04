package com.github.bordertech.webfriends.selenium.by;

import com.github.bordertech.webfriends.selenium.by.provider.HelperBy;
import com.github.bordertech.webfriends.selenium.by.provider.HelperByProvider;
import com.github.bordertech.webfriends.selenium.by.provider.TextSearchOptions;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.util.config.ConfigurationProperties;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

/**
 * An implementation of By which can find HTML elements by text node and attributes.
 */
public class ByDesc extends By {

	private static final List<String> ATTRIBUTES = ConfigurationProperties.getTextSearchAttributes();

	/**
	 * Search elements for text and attributes with exact match.
	 *
	 * @param textMatch the text to match
	 * @return the By condition
	 */
	public static ByDesc text(final String textMatch) {
		return text(textMatch, false);
	}

	/**
	 * Search elements for text and attributes match.
	 *
	 * @param textMatch the text to match
	 * @param partialMatch true if partial match
	 * @return the By condition
	 */
	public static ByDesc text(final String textMatch, boolean partialMatch) {
		return text(textMatch, partialMatch, false);
	}

	/**
	 * Search elements for text and attributes match.
	 *
	 * @param textMatch the text to match
	 * @param partialMatch true if partial match
	 * @param relative true if relative search
	 * @return the By condition
	 */
	public static ByDesc text(final String textMatch, final boolean partialMatch, boolean relative) {
		return text(null, textMatch, partialMatch, relative);
	}

	/**
	 * Search elements for a match using defined options.
	 *
	 * @param options the test search options
	 * @param relative true if relative search
	 * @return the By condition
	 */
	public static ByDesc text(final TextSearchOptions options, final boolean relative) {
		return text(null, options, relative);
	}

	/**
	 * Search elements for text and attributes with exact match and tag type.
	 *
	 * @param tag the tag type
	 * @param textMatch the text to match
	 * @return the By condition
	 */
	public static ByDesc text(final SeleniumTag tag, final String textMatch) {
		return text(tag, textMatch, false);
	}

	/**
	 * Search elements for text and attributes match with a tag type.
	 *
	 * @param tag the tag type
	 * @param textMatch the text to match
	 * @param partialMatch true if partial match
	 * @return the By condition
	 */
	public static ByDesc text(final SeleniumTag tag, final String textMatch, boolean partialMatch) {
		return text(tag, textMatch, partialMatch, false);
	}

	/**
	 * Search elements for defined options with a tag type.
	 *
	 * @param tag the tag type
	 * @param textMatch the text to match
	 * @param partialMatch true if partial match
	 * @param relative true if relative search
	 * @return the By condition
	 */
	public static ByDesc text(final SeleniumTag tag, final String textMatch, final boolean partialMatch, boolean relative) {
		return new ByDesc(tag, TextSearchOptions.both(textMatch, ATTRIBUTES, partialMatch), relative);
	}

	/**
	 * Search text for a match using the tag type and defined options.
	 *
	 * @param tag the tag type
	 * @param options the test search options
	 * @param relative true if relative search
	 * @return the By condition
	 */
	public static ByDesc text(final SeleniumTag tag, final TextSearchOptions options, final boolean relative) {
		return new ByDesc(tag, options, relative);
	}

	private final SeleniumTag tag;
	private final TextSearchOptions options;
	private final boolean relative;

	/**
	 * @param tag the optional tag type
	 * @param options the search options
	 * @param relative true if relative search
	 */
	public ByDesc(final SeleniumTag tag, final TextSearchOptions options, final boolean relative) {
		if (options == null) {
			throw new IllegalArgumentException("Search options must be provided.");
		}
		this.tag = tag;
		this.options = options;
		this.relative = relative;
	}

	/**
	 * Find the elements with text options.
	 *
	 * @param context the search context.
	 * @return the matching elements.
	 */
	@Override
	public List<WebElement> findElements(final SearchContext context) {
		HelperByProvider helper = HelperBy.getProvider();
		if (tag == null) {
			return helper.findElementsWithTextOptions(context, options, relative);
		} else {
			return helper.findElementsWithTextOptions(context, tag, options, relative);
		}
	}

}
