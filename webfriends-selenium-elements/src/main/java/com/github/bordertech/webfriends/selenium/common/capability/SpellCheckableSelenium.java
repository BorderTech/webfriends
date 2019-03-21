package com.github.bordertech.webfriends.selenium.common.capability;

import com.github.bordertech.webfriends.api.common.capability.SpellCheckable;
import com.github.bordertech.webfriends.selenium.element.SElement;

/**
 * Element that can be spell checked.
 */
public interface SpellCheckableSelenium extends SpellCheckable, SElement {

	@Override
	default SpellCheckableType getSpellCheckable() {
		String value = getAttribute(SpellCheckableType.ATTR);
		return SpellCheckableType.findType(value);
	}

}
