package com.github.bordertech.webfriends.selenium.element.form.select;

import com.github.bordertech.webfriends.api.element.form.select.HOption;
import com.github.bordertech.webfriends.api.element.form.select.HSelect;
import com.github.bordertech.webfriends.selenium.common.form.capability.AutocompleteableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.SizeableSelenium;
import com.github.bordertech.webfriends.selenium.common.form.capability.ValueMultiSelenium;
import com.github.bordertech.webfriends.selenium.common.form.control.FormControlSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagSelect;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Selenium select element.
 */
public class SSelect extends AbstractSElement implements HSelect<SOption>, FormControlSelenium,
		AutocompleteableSelenium, SizeableSelenium, ValueMultiSelenium {

	@Override
	public STagSelect getTagType() {
		return SeleniumTags.SELECT;
	}

	@Override
	public List<SOption> getOptions() {
		return getHelper().findWebFriends(getDriver(), getWebElement(), SeleniumTags.OPTION);
	}

	@Override
	public List<SOption> getOptGroups() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public HOption getOptionByIndex(final int idx) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public HOption getOptionByName(final String name) {
		return getOptions().stream().filter(option -> StringUtils.equals(option.getTextValue(), name) || StringUtils.equals(option.getLabel(), name))
				.findAny().orElse(null);
	}

	@Override
	public HOption getSelectedOption() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public List<SOption> getSelectedOptions() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void setSelectedOption(final SOption option) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void setSelectedOptions(final SOption... options) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void setValue(final String value) {
		getOptionByName(value).setSelected(true);
	}

	@Override
	public void setValues(final List<String> values) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void setValues(final String[] values) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
