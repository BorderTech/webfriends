package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.Suggestable;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.SElement;
import com.github.bordertech.webfriends.selenium.element.form.select.SDatalist;
import com.github.bordertech.webfriends.selenium.util.helper.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Element with a list of predefined suggestions.
 */
public interface SuggestableSelenium extends Suggestable, SElement {

	@Override
	public default boolean hasSuggestions() {
		return getDataList() != null;
	}

	@Override
	public default SDatalist getDataList() {
		String id = getAttribute("list");
		if (id == null) {
			return null;
		}
		WebElement element = getDriver().getWebDriver().findElement(By.id(id));
		if (element == null) {
			return null;
		}
		return Helper.getProvider().wrapWebElement(getDriver(), element, SeleniumTags.DATALIST);
	}

}
