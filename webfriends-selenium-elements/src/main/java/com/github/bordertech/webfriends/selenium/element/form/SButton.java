package com.github.bordertech.webfriends.selenium.element.form;

import com.github.bordertech.webfriends.api.element.form.HButton;
import com.github.bordertech.webfriends.selenium.common.capability.FocusableSelenium;
import com.github.bordertech.webfriends.selenium.common.category.LabelableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.AutofocusableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.DisableableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.category.FormAssociatedSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagButton;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElementSelenium;

/**
 * Selenium button element.
 */
public class SButton extends AbstractSElement implements HButton, ContainerElementSelenium,
		LabelableSelenium, FormAssociatedSelenium,
		AutofocusableSelenium, DisableableSelenium, FocusableSelenium {

	@Override
	public STagButton getTagType() {
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
