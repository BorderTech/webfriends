package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.Autocompleteable;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Form control that can be auto completed.
 */
public interface AutocompleteableSelenium extends Autocompleteable, SElement {

	@Override
	default CategoryType getAutoCategory() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	default String getAutoFieldName() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	default AutocompleteFieldType getAutoFieldNameAsType() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	default String getAutoHintSet() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	default HintSetType getAutoHintSetAsType() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	default String getAutoScope() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
