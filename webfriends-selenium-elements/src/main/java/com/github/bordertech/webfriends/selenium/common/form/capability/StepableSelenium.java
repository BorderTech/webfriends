package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.Stepable;
import com.github.bordertech.webfriends.selenium.element.SElement;
import java.math.BigDecimal;
import org.apache.commons.lang3.StringUtils;

/**
 * Element with a value that can be stepped.
 */
public interface StepableSelenium extends Stepable, SElement {

	@Override
	public default boolean isAnyStep() {
		String value = getAttribute("step");
		return StringUtils.equalsIgnoreCase("any", value);
	}

	@Override
	public default BigDecimal getStep() {
		if (isAnyStep()) {
			return null;
		}
		String value = getAttribute("step");
		return BigDecimal.valueOf(Double.valueOf(value));
	}

	@Override
	public default void stepUp() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public default void stepUp(final int steps) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public default void stepDown() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public default void stepDown(final int steps) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
