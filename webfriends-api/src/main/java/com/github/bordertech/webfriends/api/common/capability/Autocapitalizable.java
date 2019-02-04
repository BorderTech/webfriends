package com.github.bordertech.webfriends.api.common.capability;

import com.github.bordertech.webfriends.api.common.attribute.AttributeToken;
import com.github.bordertech.webfriends.api.element.Element;
import org.apache.commons.lang3.StringUtils;

/**
 * Element that can be autocapitalized.
 */
public interface Autocapitalizable extends Element {

	/**
	 * Autocapitalize types.
	 */
	enum AutocapitalizeType implements AttributeToken {
		DEFAULT(null),
		OFF("off"),
		NONE("none"),
		ON("on"),
		SENTENCES("sentences"),
		WORDS("words"),
		CHARACTERS("characters");

		/**
		 * @param token the attribute token
		 */
		private AutocapitalizeType(final String token) {
			this.token = token;
		}

		private final String token;

		@Override
		public String getToken() {
			return token;
		}

		/**
		 * Attribute key.
		 */
		public static final String ATTR = "autocapitalize";

		/**
		 * @param token the token to match
		 * @return the matching type
		 */
		public static AutocapitalizeType findType(final String token) {
			for (AutocapitalizeType type : AutocapitalizeType.values()) {
				if (StringUtils.equalsIgnoreCase(type.getToken(), token)) {
					return type;
				}
			}
			return null;
		}
	}

	/**
	 * @return the auto capitalize type or null
	 */
	AutocapitalizeType getAutocapitalize();
}
