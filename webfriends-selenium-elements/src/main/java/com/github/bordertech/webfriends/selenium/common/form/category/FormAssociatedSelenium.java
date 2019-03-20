package com.github.bordertech.webfriends.selenium.common.form.category;

import com.github.bordertech.webfriends.api.common.form.category.FormAssociated;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Element can be form associated.
 */
public interface FormAssociatedSelenium extends FormAssociated, SElement {

	@Override
	public default String getName() {
		return getAttribute("name");
	}

}
