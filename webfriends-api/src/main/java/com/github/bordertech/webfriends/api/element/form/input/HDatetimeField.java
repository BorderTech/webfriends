package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.form.control.FormDateControl;
import com.github.bordertech.webfriends.api.common.tags.TagInputDateTime;

/**
 * Date and time input element.
 */
public interface HDatetimeField extends InputElement, FormDateControl {

	@Override
	TagInputDateTime getTagType();

	@Override
	default InputType getInputType() {
		return InputType.DATETIME;
	}

	/**
	 * @param year the year value of greater than 0
	 * @param month the month value of 1 to 12
	 * @param day the day value of 1 to 31
	 * @param hour the hour value 0 to 23
	 * @param minutes the minute value 0 to 59
	 * @param seconds the value 0 to 59
	 */
	void setValue(final int year, final int month, final int day, final int hour, final int minutes, final int seconds);

}
