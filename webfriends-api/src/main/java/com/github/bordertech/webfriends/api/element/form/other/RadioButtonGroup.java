package com.github.bordertech.webfriends.api.element.form.other;

import com.github.bordertech.webfriends.api.element.form.input.HRadioButton;
import java.util.List;

/**
 * Radio button group.
 */
public interface RadioButtonGroup {

	/**
	 * @return the name of the radio button group
	 */
	String getName();

	/**
	 * @return the radio buttons in the group
	 */
	List<? extends HRadioButton> getRadioButtons();

	/**
	 * @return the selected value in the radio button group, or null
	 */
	String getValue();

	/**
	 * @param value the value to select
	 */
	void setValue(final String value);

	/**
	 * @param radioButton the radio button to select
	 */
	void setSelected(final HRadioButton radioButton);

	/**
	 * @return the selected radio button, or null
	 */
	HRadioButton getSelected();

}
