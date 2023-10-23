package com.github.bordertech.webfriends.api.element.grouping;

import com.github.bordertech.webfriends.api.common.attribute.AttributeToken;
import org.apache.commons.lang3.StringUtils;
import com.github.bordertech.webfriends.api.common.tags.TagOL;

/**
 * Ordered list element.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/ol">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-ol-element">HTML Spec</a>
 */
public interface HOrderedList extends ListContainerElement {

	@Override
	TagOL getTagType();

	/**
	 * List marker type.
	 */
	enum MarkerType implements AttributeToken {
		DECIMAL("1"),
		UPPER_ALPHA("A"),
		LOWER_ALPHA("a"),
		UPPER_ROMAN("I"),
		LOWER_ROMAN("i");

		/**
		 * Attribute key.
		 */
		public static final String ATTR = "marker";

		private final String token;

		/**
		 * @param token the attribute token
		 */
		private MarkerType(final String token) {
			this.token = token;
		}

		@Override
		public String getToken() {
			return token;
		}

		/**
		 * @param token the token to match
		 * @return the matching type
		 */
		public static MarkerType findType(final String token) {
			if (token == null) {
				return null;
			}
			for (MarkerType type : MarkerType.values()) {
				if (StringUtils.equalsIgnoreCase(type.getToken(), token)) {
					return type;
				}
			}
			return null;
		}

	}

	/**
	 * @return true if number list backwards
	 */
	boolean isReversed();

	/**
	 * @return the starting value of the list
	 */
	int getStart();

	/**
	 * @return the kind of list marker or null for default
	 */
	MarkerType getMarkerType();

}
