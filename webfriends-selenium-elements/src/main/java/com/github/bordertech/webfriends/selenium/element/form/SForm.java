package com.github.bordertech.webfriends.selenium.element.form;

import com.github.bordertech.webfriends.api.element.form.HForm;
import com.github.bordertech.webfriends.selenium.common.capability.AutocapitalizableSelenium;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithButtons;
import com.github.bordertech.webfriends.selenium.common.feature.ContainerWithChildren;
import com.github.bordertech.webfriends.selenium.common.form.category.FormAssociatedSelenium;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagForm;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import com.github.bordertech.webfriends.selenium.smart.driver.SmartDriverUtil;
import java.util.List;

/**
 * Selenium form element.
 */
public class SForm extends AbstractSElement implements HForm,
		AutocapitalizableSelenium,
		ContainerWithChildren, ContainerWithButtons {

	@Override
	public STagForm getTagType() {
		return SeleniumTags.FORM;
	}

	@Override
	public String getFormName() {
		return getAttribute("name");
	}

	@Override
	public String getActionUrl() {
		return getAttribute("action");
	}

	@Override
	public AutocompleteType getAutocomplete() {
		return getAttributeToken(AutocompleteType.ATTR, AutocompleteType.values());
	}

	@Override
	public String getMethod() {
		return getAttribute("method");
	}

	@Override
	public boolean isNoValidate() {
		return getAttributeAsBoolean("novalidate");
	}

	@Override
	public String getFormTarget() {
		return getAttribute("target");
	}

	@Override
	public List<? extends FormAssociatedSelenium> getAssociated() {
		return SmartDriverUtil.findFormAssociated(this);
	}

	@Override
	public void formSubmit() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void formReset() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
