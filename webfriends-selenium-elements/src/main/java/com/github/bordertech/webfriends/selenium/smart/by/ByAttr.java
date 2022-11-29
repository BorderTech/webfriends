package com.github.bordertech.webfriends.selenium.smart.by;

import com.github.bordertech.webfriends.selenium.common.tag.TagTypeSelenium;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

import static com.github.bordertech.webfriends.selenium.smart.by.TextSearchOptions.attributesOnly;

/**
 * An implementation of By which can find HTML elements by an attribute value.
 */
public class ByAttr extends By {

    private final TagTypeSelenium tag;
    private final TextSearchOptions options;
    private final boolean relative;

    public ByAttr(final TagTypeSelenium tag, final String match, final boolean relative, final String... attrs) {
        this.tag = tag;
        this.options = attributesOnly(match, Arrays.asList(attrs));
        this.relative = relative;
    }

    /**
     * Find the elements by attribute value.
     *
     * @param context the search context.
     * @return the matching elements.
     */
    @Override
    public List<WebElement> findElements(SearchContext context) {
        return SmartHelper.getProvider().findElementsWithTextOptions(context, tag, options, relative);
    }
}
