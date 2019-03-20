package com.github.bordertech.webfriends.selenium.element.form;

import com.github.bordertech.webfriends.api.element.form.HButton;
import com.github.bordertech.webfriends.selenium.common.capability.FocusableSelenium;
import com.github.bordertech.webfriends.selenium.common.category.LabelableSelenium;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElement;
import com.github.bordertech.webfriends.selenium.common.form.capability.AutofocusableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.DisableableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.category.FormAssociatedSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;

/**
 * Selenium button element.
 */
public class SButton extends AbstractSElement implements HButton, ContainerElement,
		LabelableSelenium, FormAssociatedSelenium,
		AutofocusableSelenium, DisableableSelenium, FocusableSelenium {

	@Override
	public SeleniumTag<? extends SButton> getElementTag() {
		return SeleniumTags.BUTTON;
	}

	@Override
	public ButtonType getButtonType() {
		return getAttributeToken(ButtonType.ATTR, ButtonType.values());
	}

	@Override
	public String getButtonText() {
		return getWebElement().getText();
	}

}
