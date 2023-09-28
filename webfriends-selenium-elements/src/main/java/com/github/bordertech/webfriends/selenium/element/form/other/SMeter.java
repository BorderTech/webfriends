package com.github.bordertech.webfriends.selenium.element.form.other;

import com.github.bordertech.webfriends.api.element.form.other.HMeter;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.common.tags.STagMeter;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import java.math.BigDecimal;

/**
 * Selenium meter element.
 */
public class SMeter extends AbstractSElement implements HMeter {

	@Override
	public STagMeter getTagType() {
		return SeleniumTags.METER;
	}

	@Override
	public BigDecimal getValue() {
		return getAttributeAsBigDecimal("value");
	}

	@Override
	public BigDecimal getMin() {
		return getAttributeAsBigDecimal("min");
	}

	@Override
	public BigDecimal getMax() {
		return getAttributeAsBigDecimal("max");
	}

	@Override
	public BigDecimal getLow() {
		return getAttributeAsBigDecimal("low");
	}

	@Override
	public BigDecimal getHigh() {
		return getAttributeAsBigDecimal("high");
	}

	@Override
	public BigDecimal getOptimum() {
		return getAttributeAsBigDecimal("optimum");
	}

}
