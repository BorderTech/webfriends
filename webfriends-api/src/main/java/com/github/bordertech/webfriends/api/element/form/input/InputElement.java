package com.github.bordertech.webfriends.api.element.form.input;

import com.github.bordertech.webfriends.api.common.attribute.AttributeToken;
import com.github.bordertech.webfriends.api.common.form.control.FormControl;
import com.github.bordertech.webfriends.api.common.model.NothingContentModel;
import com.github.bordertech.webfriends.api.common.tag.TagInputType;
import org.apache.commons.lang3.StringUtils;

/**
 * Input element.
 */
public interface InputElement extends FormControl, NothingContentModel {

	/**
	 * Input types.
	 */
	enum InputType implements AttributeToken {
		TEXT("text"),
		SEARCH("search"),
		TELEPHONE("tel"),
		URL("url"),
		EMAIL("email"),
		PASSWORD("password"),
		DATE("date"),
		DATETIME("datetime-local"),
		NUMBER("number"),
		RANGE("range"),
		COLOR("color"),
		CHECKBOX("checkbox"),
		RADIO("radio"),
		FILEUPLOAD("file");

		private final String token;

		/**
		 * Attribute key.
		 */
		public static final String ATTR = "type";

		/**
		 * @param token the token
		 */
		private InputType(final String token) {
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
		public static InputType findType(final String token) {
			if (token == null) {
				return null;
			}
			for (InputType type : InputType.values()) {
				if (StringUtils.equalsIgnoreCase(type.getToken(), token)) {
					return type;
				}
			}
			return null;
		}
	}

	@Override
	TagInputType getTagType();

	/**
	 * @return the input type
	 */
	InputType getInputType();

}
