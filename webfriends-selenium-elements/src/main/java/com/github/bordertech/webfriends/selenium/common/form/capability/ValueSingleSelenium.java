package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.ValueSingle;
import com.github.bordertech.webfriends.selenium.common.capability.FocusableSelenium;
import org.openqa.selenium.By;

/**
 * Input element that has a single value.
 */
public interface ValueSingleSelenium extends ValueSingle, FocusableSelenium {

	@Override
	public default String getValue() {
		return getAttribute("value");
	}

	@Override
	public default boolean isValidState() {
		// TODO Will this work??
		return getWebElement().findElement(By.cssSelector("input#" + getId() + " input:valid")) == null;
	}

	@Override
	public default void clearValue() {
		getWebElement().clear();
	}
}
