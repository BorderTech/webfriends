package com.github.bordertech.webfriends.selenium.element.form.other;

import com.github.bordertech.webfriends.api.element.form.other.HProgress;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTag;
import com.github.bordertech.webfriends.selenium.common.tag.SeleniumTags;
import com.github.bordertech.webfriends.selenium.element.AbstractSElement;
import java.math.BigDecimal;

/**
 * Selenium progress element.
 */
public class SProgress extends AbstractSElement implements HProgress {

	@Override
	public SeleniumTag<? extends SProgress> getElementTag() {
		return SeleniumTags.PROGRESS;
	}

	@Override
	public BigDecimal getValue() {
		return getAttributeAsBigDecimal("value");
	}

	@Override
	public BigDecimal getMax() {
		return getAttributeAsBigDecimal("max");
	}

}
