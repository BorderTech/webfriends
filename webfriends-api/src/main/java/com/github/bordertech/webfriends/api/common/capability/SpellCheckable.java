package com.github.bordertech.webfriends.api.common.capability;

import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that can be spell checked.
 */
public interface SpellCheckable extends Element {

	/**
	 * Spell check type.
	 */
	enum SpellCheckableType {
		YES,
		NO,
		DEFAULT;

		/**
		 * The attribute key.
		 */
		public static final String ATTR = "spellcheck";

		/**
		 * @param value the attribute value
		 * @return the matching spell check type
		 */
		public static SpellCheckableType findType(final String value) {
			if (value == null) {
				return SpellCheckableType.DEFAULT;
			}
			if (value.isEmpty()) {
				return SpellCheckableType.YES;
			}
			switch (value.toLowerCase()) {
				case "true":
					return SpellCheckableType.YES;
				case "false":
					return SpellCheckableType.NO;
				default:
					return SpellCheckableType.DEFAULT;
			}
		}
	}

	/**
	 * @return the spell checkable type
	 */
	SpellCheckableType getSpellCheckable();

}
