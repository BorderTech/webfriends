package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element is checkable.
 */
public interface Checkable extends Element {

	/**
	 * @return true if checked
	 */
	boolean isChecked();

	/**
	 * @param checked true if checked
	 */
	void setChecked(final boolean checked);

}
