package com.github.bordertech.webfriends.api.element.form.other;

import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.category.PhrasingContent;
import com.github.bordertech.webfriends.api.common.context.PhrasingContext;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.model.PhrasingModel;
import com.github.bordertech.webfriends.api.common.tags.TagMeter;
import com.github.bordertech.webfriends.api.element.Element;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Meter element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/meter">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-meter-element">HTML Spec</a>
 */
public interface HMeter extends PhrasingContent, PalpableContent,
		PhrasingContext,
		PhrasingModel, CustomModel {

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
