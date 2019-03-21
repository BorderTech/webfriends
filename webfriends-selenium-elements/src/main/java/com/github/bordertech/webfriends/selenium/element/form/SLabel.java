package com.github.bordertech.webfriends.selenium.element.form;

import com.github.bordertech.webfriends.api.element.form.HLabel;
import com.github.bordertech.webfriends.selenium.common.capability.FocusableSelenium;
import com.github.bordertech.webfriends.selenium.common.category.LabelableSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartHelper;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.element.SElement;
import org.openqa.selenium.WebElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagLabel;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerElementSelenium;

/**
 * Selenium label element.
 */
public class SLabel extends AbstractSElement implements HLabel, ContainerElementSelenium, FocusableSelenium {

	@Override
	public STagLabel getTagType() {
		return SeleniumTags.LABEL;
	}

	@Override
	public String getLabelText() {
		return getWebElement().getText();
	}

	@Override
	public String getForId() {
		return getAttribute("for");
	}

	@Override
	public boolean isNested() {
		return getForId() == null;
	}

	@Override
	public LabelableSelenium getLabeledElement() {
		// Find the labeled element
		WebElement labeled = SmartHelper.getProvider().findLabeledElementWithLabel(getWebElement());
		if (labeled == null) {
			return null;
		}
		// Wrap it in Selenium element
		SElement element = getHelper().wrapWebElement(getDriver(), labeled);
		// Check element is labelable
		if (element instanceof LabelableSelenium) {
			return (LabelableSelenium) element;
		}
		if (element != null) {
			throw new IllegalStateException("Element [" + element.getTagType().getTagName() + "] is not labelable.");
		}
		return null;
	}

}
