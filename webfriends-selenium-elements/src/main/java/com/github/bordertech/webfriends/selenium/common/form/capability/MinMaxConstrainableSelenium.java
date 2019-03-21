package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.MinMaxConstrainable;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Element that has min and max value constraints.
 *
 * @param <T> the element value data type
 */
public interface MinMaxConstrainableSelenium<T> extends MinMaxConstrainable<T>, SElement {

	@Override
	default String getMinValue() {
		return getAttribute("min");
	}

	@Override
	default String getMaxValue() {
		return getAttribute("max");
	}

}
