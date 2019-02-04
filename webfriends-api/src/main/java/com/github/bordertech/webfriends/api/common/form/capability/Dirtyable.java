package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that can have a dirty state.
 */
public interface Dirtyable extends Element {

	/**
	 * The Dirty flag tracks the interaction between the value and the default value.
	 * <p>
	 * If it is false the value mirrors the default value. If it is true, the default value is ignored.
	 * </p>
	 *
	 * @return true if the element value is different from the default value, otherwise false.
	 */
	boolean isDirty();

}
