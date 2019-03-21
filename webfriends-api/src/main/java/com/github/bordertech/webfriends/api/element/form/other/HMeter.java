package com.github.bordertech.webfriends.api.element.form.other;

import com.github.bordertech.webfriends.api.common.combo.PhrasingPalpableElement;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.tags.TagMeter;
import com.github.bordertech.webfriends.api.element.Element;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Meter element.
 */
public interface HMeter extends PhrasingPalpableElement, CustomModel {

	@Override
	TagMeter getTagType();

	/**
	 * @return the current value of the element, or null
	 */
	BigDecimal getValue();

	/**
	 * @return the lower bound of the range, or null
	 */
	BigDecimal getMin();

	/**
	 * @return the upper bound of the range, or null
	 */
	BigDecimal getMax();

	/**
	 * @return the high limit of the low range, or null
	 */
	BigDecimal getLow();

	/**
	 * @return the low limit of the high range, or null
	 */
	BigDecimal getHigh();

	/**
	 * @return the optimum value in the gauge
	 */
	BigDecimal getOptimum();

	@Override
	default List<Class<? extends Element>> getDescendantsExcluded() {
		return Arrays.asList(HMeter.class);
	}
}
