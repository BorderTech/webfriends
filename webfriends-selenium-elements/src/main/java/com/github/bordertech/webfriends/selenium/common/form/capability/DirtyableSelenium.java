package com.github.bordertech.webfriends.selenium.common.form.capability;

import com.github.bordertech.webfriends.api.common.form.capability.Dirtyable;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Element that can have a dirty state.
 */
public interface DirtyableSelenium extends Dirtyable, SElement {

	@Override
	default boolean isDirty() {
		return getAttributeAsBoolean("dirty");
	}

}
