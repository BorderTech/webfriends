package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.MinMaxConstrainableNumber;
import java.math.BigDecimal;

/**
 * Element that has min and max BigDeciaml value constraints.
 */
public interface MinMaxConstrainableNumberSelenium extends MinMaxConstrainableNumber, MinMaxConstrainableSelenium<BigDecimal> {

	@Override
	public default BigDecimal getMinValueAsType() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public default BigDecimal getMaxValueAsType() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
