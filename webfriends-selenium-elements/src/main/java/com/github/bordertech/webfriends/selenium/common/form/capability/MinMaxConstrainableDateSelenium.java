package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.MinMaxConstrainableDate;
import java.util.Date;

/**
 * Element that has min and max Date value constraints.
 */
public interface MinMaxConstrainableDateSelenium extends MinMaxConstrainableDate, MinMaxConstrainableSelenium<Date> {

	@Override
	default Date getMinValueAsType() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	default Date getMaxValueAsType() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
