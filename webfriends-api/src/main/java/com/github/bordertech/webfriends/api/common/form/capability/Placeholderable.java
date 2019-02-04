package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that has a place holder.
 */
public interface Placeholderable extends Element {

	/**
	 * @return a short hint intended to aid the user, or null
	 */
	String getPlaceholder();

}
