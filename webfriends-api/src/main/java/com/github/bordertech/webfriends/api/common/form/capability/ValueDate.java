package com.github.bordertech.webfriends.api.common.form.capability;

import java.util.Date;

/**
 * Date value accessors.
 */
public interface ValueDate extends ValueSingle {

	/**
	 * @return the value as a date
	 */
	Date getValueAsDate();

	/**
	 * @param date the date value to set
	 */
	void setValue(final Date date);

	/**
	 * @param year the year value of greater than 0
	 * @param month the month value of 1 to 12
	 * @param day the day value of 1 to 31
	 */
	void setValue(final int year, final int month, final int day);

}
