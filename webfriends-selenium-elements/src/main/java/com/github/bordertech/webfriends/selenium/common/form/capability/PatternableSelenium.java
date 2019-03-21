package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.Patternable;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Element that allows the input to be checked against a regular expression.
 */
public interface PatternableSelenium extends Patternable, SElement {

	@Override
	default String getPattern() {
		return getAttribute("pattern");
	}

}
