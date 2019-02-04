package com.github.bordertech.webfriends.api.common.form.capability;

import com.github.bordertech.webfriends.api.common.attribute.AttributeToken;
import com.github.bordertech.webfriends.api.element.Element;
import org.apache.commons.lang3.StringUtils;

/**
 * Form control that can be auto completed.
 */
public interface Autocompleteable extends Element {

	enum CategoryType {
		OFF,
		AUTOMATIC,
		NORMAL,
		CONTACT
	}

	enum HintSetType {
		SHIPPING,
		BILLING
	}

	enum AutocompleteFieldType implements AttributeToken {
		FULL_NAME("name"),
		TITLE("honorific-prefix"),
		GIVEN_NAME("given-name");
		// TODO Lots more https://wiki.whatwg.org/wiki/Autocomplete_Types
//"name"
//"honorific-prefix"
//"given-name"
//"additional-name"
//"family-name"
//"honorific-suffix"
//"nickname"
//"username"
//"new-password"
//"current-password"
//"organization-title"
//"organization"
//"street-address"
//"address-line1"
//"address-line2"
//"address-line3"
//"address-level4"
//"address-level3"
//"address-level2"
//"address-level1"
//"country"
//"country-name"
//"postal-code"
//"cc-name"
//"cc-given-name"
//"cc-additional-name"
//"cc-family-name"
//"cc-number"
//"cc-exp"
//"cc-exp-month"
//"cc-exp-year"
//"cc-csc"
//"cc-type"
//"transaction-currency"
//"transaction-amount"
//"language"
//"bday"
//"bday-day"
//"bday-month"
//"bday-year"
//"sex"
//"url"
//"photo"// TODO Lots more https://wiki.whatwg.org/wiki/Autocomplete_Types
//"name"
//"honorific-prefix"
//"given-name"
//"additional-name"
//"family-name"
//"honorific-suffix"
//"nickname"
//"username"
//"new-password"
//"current-password"
//"organization-title"
//"organization"
//"street-address"
//"address-line1"
//"address-line2"
//"address-line3"
//"address-level4"
//"address-level3"
//"address-level2"
//"address-level1"
//"country"
//"country-name"
//"postal-code"
//"cc-name"
//"cc-given-name"
//"cc-additional-name"
//"cc-family-name"
//"cc-number"
//"cc-exp"
//"cc-exp-month"
//"cc-exp-year"
//"cc-csc"
//"cc-type"
//"transaction-currency"
//"transaction-amount"
//"language"
//"bday"
//"bday-day"
//"bday-month"
//"bday-year"
//"sex"
//"url"
//"photo"

		/**
		 * @param token the token
		 */
		private AutocompleteFieldType(final String token) {
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
		public static final String ATTR = "autocomplete";

		/**
		 * @param token the token to match
		 * @return the matching type
		 */
		public static AutocompleteFieldType findType(final String token) {
			if (token == null) {
				return null;
			}
			for (AutocompleteFieldType type : AutocompleteFieldType.values()) {
				if (StringUtils.equalsIgnoreCase(type.getToken(), token)) {
					return type;
				}
			}
			return null;
		}

	}

	/**
	 * @return the auto complete category for this field
	 */
	CategoryType getAutoCategory();

	/**
	 * @return the specific kind of data expected in the field (eg street-address)
	 */
	String getAutoFieldName();

	/**
	 * @return the field type expected or null
	 */
	AutocompleteFieldType getAutoFieldNameAsType();

	/**
	 * @return the address or contact information to use as the hint set (eg billing, shipping)
	 */
	String getAutoHintSet();

	/**
	 * @return the hint set as a type, or null
	 */
	HintSetType getAutoHintSetAsType();

	/**
	 * @return the scope for the field (eg section-parent, section-child)
	 */
	String getAutoScope();

}
