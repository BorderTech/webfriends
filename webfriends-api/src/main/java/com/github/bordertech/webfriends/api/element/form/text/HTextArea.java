package com.github.bordertech.webfriends.api.element.form.text;

import com.github.bordertech.webfriends.api.common.attribute.AttributeToken;
import com.github.bordertech.webfriends.api.common.form.control.FormTextControl;
import com.github.bordertech.webfriends.api.common.model.TextModel;
import com.github.bordertech.webfriends.api.common.tags.TagTextArea;
import org.apache.commons.lang3.StringUtils;

/**
 * TextArea element.
 */
public interface HTextArea extends FormTextControl, TextModel {

	@Override
	TagTextArea getTagType();

	/**
	 * Wrap types.
	 */
	enum WrapType implements AttributeToken {
		SOFT("soft"),
		HARD("hard");

		/**
		 * Attribute key.
		 */
		public static final String ATTR = "wrap";

		private final String token;

		/**
		 * @param token the token
		 */
		private WrapType(final String token) {
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
		public static WrapType findType(final String token) {
			if (token == null) {
				return null;
			}
			for (WrapType type : WrapType.values()) {
				if (StringUtils.equalsIgnoreCase(type.getToken(), token)) {
					return type;
				}
			}
			return null;
		}

	}

	/**
	 * @return the maximum number of characters per line, or the default is 20
	 */
	int getCols();

	/**
	 * @return the number of lines to show, or the default is 2
	 */
	int getRows();

	/**
	 *
	 * @return the wrap type to use when submitting the form
	 */
	WrapType getWrapType();

}
