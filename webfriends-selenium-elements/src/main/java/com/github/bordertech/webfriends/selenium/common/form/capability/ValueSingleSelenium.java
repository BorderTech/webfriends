package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.ValueSingle;
import com.github.bordertech.webfriends.selenium.common.capability.FocusableSelenium;
import com.github.bordertech.webfriends.selenium.common.feature.Clickable;
import com.github.bordertech.webfriends.selenium.common.feature.Keyboardable;
import org.openqa.selenium.By;

/**
 * Input element that has a single value.
 */
public interface ValueSingleSelenium extends ValueSingle, FocusableSelenium, Clickable, Keyboardable {

	@Override
	default String getValue() {
		return getAttribute("value");
	}

	@Override
	default boolean isValidState() {
		// TODO Will this work??
		return getWebElement().findElement(By.cssSelector("input#" + getId() + " input:valid")) == null;
	}

	@Override
	default void clearValue() {
		getWebElement().clear();
	}
}
