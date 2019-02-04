package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;
import java.math.BigDecimal;

/**
 * Element with a value that can be stepped.
 */
public interface Stepable extends Element {

	/**
	 * @return true if no allowed step.
	 */
	boolean isAnyStep();

	/**
	 * @return the step value as a decimal, or null
	 */
	BigDecimal getStep();

	/**
	 * Step up one step.
	 */
	void stepUp();

	/**
	 * @param steps the number of steps to step up
	 */
	void stepUp(final int steps);

	/**
	 * Step down one step.
	 */
	void stepDown();

	/**
	 * @param steps the number of steps to step down
	 */
	void stepDown(final int steps);

}
