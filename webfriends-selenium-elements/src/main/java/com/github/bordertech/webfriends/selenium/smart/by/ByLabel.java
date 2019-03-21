package com.github.bordertech.webfriends.selenium.smart.by;

import com.github.bordertech.webfriends.selenium.smart.driver.SmartHelper;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartHelperProvider;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

/**
 * An implementation of By which can find HTML elements by the element's label.
 */
public class ByLabel extends By {

	private final String labelText;
	private final boolean partialMatch;
	private final boolean relative;

	/**
	 * ByLabel using the label's text and exact match.
	 *
	 * @param labelText the text used to find the label
	 * @return a By which locates elements that are labeled by provided text
	 */
	public static ByLabel text(final String labelText) {
		return text(labelText, false);
	}

	/**
	 * ByLabel using the label's text.
	 *
	 * @param labelText the text used to find the label
	 * @param partialMatch whether it can be a partial text match
	 * @return a By which locates elements that are labeled by provided text
	 */
	public static ByLabel text(final String labelText, final boolean partialMatch) {
		return text(labelText, partialMatch, false);
	}

	/**
	 * ByLabel using the label's text.
	 *
	 * @param labelText the text used to find the label
	 * @param partialMatch whether it can be a partial text match
	 * @param relative whether to use a relative xpath lookup
	 * @return a By which locates elements that are labeled by provided text
	 */
	public static ByLabel text(final String labelText, final boolean partialMatch, final boolean relative) {
		return new ByLabel(labelText, partialMatch, relative);
	}

	/**
	 * ByLabel using the label's text, either as an exact or partial match and using a relative XPATh to explicitly look
	 * 'inside' the current element.
	 *
	 * @param labelText the text used to find the label
	 * @param partialMatch whether it can be a partial text match
	 * @param relative whether to use a relative xpath lookup
	 */
	public ByLabel(final String labelText, final boolean partialMatch, final boolean relative) {
		if (StringUtils.isEmpty(labelText)) {
			throw new IllegalArgumentException("Label text must be provided.");
		}
		this.labelText = labelText;
		this.partialMatch = partialMatch;
		this.relative = relative;
	}

	/**
	 * Find the elements by label.
	 *
	 * @param context the search context.
	 * @return the matching elements.
	 */
	@Override
	public List<WebElement> findElements(final SearchContext context) {
		SmartHelperProvider helper = SmartHelper.getProvider();
		return helper.findLabeledElementsWithText(context, labelText, partialMatch, relative);
	}

}
