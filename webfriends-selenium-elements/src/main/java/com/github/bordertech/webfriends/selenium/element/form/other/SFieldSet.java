package com.github.bordertech.webfriends.selenium.element.form.other;

import com.github.bordertech.webfriends.api.element.form.other.HFieldSet;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElement;
import com.github.bordertech.webfriends.selenium.common.form.capability.DisableableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.category.FormAssociatedSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Selenium fieldset element.
 */
public class SFieldSet extends AbstractSElement implements HFieldSet, ContainerElement,
		DisableableSelenium, FormAssociatedSelenium {

	@Override
	public SeleniumTag<? extends SFieldSet> getElementTag() {
		return SeleniumTags.FIELDSET;
	}

	@Override
	public String getLegendText() {
		WebElement element = getWebElement().findElement(By.tagName("legend"));
		return element == null ? null : element.getText();
	}
}
