package com.github.bordertech.webfriends.selenium.element.form.select;

import com.github.bordertech.webfriends.api.element.form.select.HOption;
import com.github.bordertech.webfriends.selenium.common.form.capability.DisableableSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.common.tags.STagOption;

/**
 * Selenium option element.
 */
public class SOption extends AbstractSElement implements HOption, DisableableSelenium {

	@Override
	public STagOption getTagType() {
		return SeleniumTags.OPTION;
	}

	@Override
	public String getValue() {
		return getAttribute("value");
	}

	@Override
	public String getLabel() {
		return getAttribute("label");
	}

	@Override
	public boolean isSelected() {
		return getWebElement().isSelected();
	}

	@Override
	public int getOptionIndex() {
		Integer idx = getAttributeAsInteger("index");
		return idx == null ? -1 : idx;
	}

	@Override
	public String getTextValue() {
		return getWebElement().getText();
	}

	@Override
	public void setSelected(final boolean selected) {
		if (selected != isSelected()) {
			getWebElement().click();
		}
	}
}
