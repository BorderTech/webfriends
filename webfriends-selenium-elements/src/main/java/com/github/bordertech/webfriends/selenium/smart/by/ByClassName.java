package com.github.bordertech.webfriends.selenium.smart.by;

import com.github.bordertech.webfriends.selenium.common.tag.TagTypeSelenium;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriverUtil;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

/**
 * An implementation of By which can find HTML elements by the element's class.
 */
public class ByClassName extends By {

	private final TagTypeSelenium tag;
	private String className;

	/**
	 *
	 * @param tag the required tag type (for now)
	 * @param className the class name to search for
	 */
	public ByClassName(final TagTypeSelenium tag, String className) {
		this.tag = tag;
		this.className = className;
	}

	/**
	 * Find the elements by class.
	 *
	 * @param context the search context.
	 * @return the matching elements.
	 */
	@Override
	public List<WebElement> findElements(final SearchContext context) {
		return SmartDriverUtil.findWebElements(context, tag, new By.ByClassName(className));
	}
}
