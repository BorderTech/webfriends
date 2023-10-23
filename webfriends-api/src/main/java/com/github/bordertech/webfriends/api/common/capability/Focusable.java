package com.github.bordertech.webfriends.api.common.capability;

import com.github.bordertech.webfriends.api.common.attribute.AttributeNumericToken;
import com.github.bordertech.webfriends.api.element.Element;

/**
 * Element that can be focused (ie tabindex and accesskey).
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/tabindex">Web Docs tabindex</a>
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/accesskey">Web Docs accesskey</a>
 * @see <a href="https://html.spec.whatwg.org/#the-tabindex-attribute">HTML Spec tabindex</a>
 * @see <a href="https://html.spec.whatwg.org/#the-accesskey-attribute">HTML Spec accesskey</a>
 */
public interface Focusable extends Element {

	/**
	 * Tab index type.
	 */
	enum TabIndexType implements AttributeNumericToken {
		/**
		 * Logical tab order (ie default).
		 */
		DEFAULT(null),
		/**
		 * Tab index of -1 removes the element from the tab order.
		 */
		OFF(-1),
		/**
		 * Zero tab index allows an element to be focused but does not change the logical order.
		 */
		ON(0);

		/**
		 * @param token the attribute token
		 */
		private TabIndexType(final Integer token) {
			this.token = token;
		}

		private final Integer token;

		@Override
		public Integer getToken() {
			return token;
		}

		/**
		 * Attribute key.
		 */
		public static final String ATTR = "tabindex";

		/**
		 * @param token the token to match
		 * @return the matching type
		 */
		public static TabIndexType findType(final Integer token) {
			if (token == null) {
				return DEFAULT;
			} else if (token >= 0) {
				return ON;
			}
			return OFF;
		}
	}

	/**
	 * @return the tab index type
	 */
	TabIndexType getTabIndex();

	/**
	 * Tab index should be null, -1 or zero.
	 * <p>
	 * Zero allows an element to be focused but does not change the logical order. -1 removes the element from the tab order.
	 * </p>
	 *
	 * @return the tab index, or null
	 */
	Integer getTabIndexValue();

	/**
	 * @return the keyboard shortcut that activates or focuses the element.
	 */
	String getAccessKey();

}
