package com.github.bordertech.webfriends.api.element.form;

import com.github.bordertech.webfriends.api.common.attribute.AttributeToken;
import com.github.bordertech.webfriends.api.common.capability.Focusable;
import com.github.bordertech.webfriends.api.common.category.InteractiveContent;
import com.github.bordertech.webfriends.api.common.category.Labelable;
import com.github.bordertech.webfriends.api.common.category.PhrasingContent;
import com.github.bordertech.webfriends.api.common.combo.FlowPalpableElement;
import com.github.bordertech.webfriends.api.common.form.capability.Autofocusable;
import com.github.bordertech.webfriends.api.common.form.capability.Disableable;
import com.github.bordertech.webfriends.api.common.form.category.AutocapitalizeInheriting;
import com.github.bordertech.webfriends.api.common.form.category.Listed;
import com.github.bordertech.webfriends.api.common.form.category.Submittable;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.tag.ElementTag;
import com.github.bordertech.webfriends.api.common.tag.StandardTags;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * Button element.
 */
public interface HButton extends FlowPalpableElement, PhrasingContent, InteractiveContent,
		CustomModel,
		Listed, Labelable, Submittable, AutocapitalizeInheriting,
		Autofocusable, Disableable, Focusable {

	@Override
	public default ElementTag<? extends HButton> getElementTag() {
		return StandardTags.BUTTON;
	}

	enum ButtonType implements AttributeToken {
		SUBMIT("submit"),
		RESET("reset"),
		BUTTON("button");

		/**
		 * Attribute key.
		 */
		public static final String ATTR = "type";

		private final String token;

		/**
		 * @param token the token
		 */
		private ButtonType(final String token) {
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
		public static ButtonType findType(final String token) {
			if (token == null) {
				return null;
			}
			for (ButtonType type : ButtonType.values()) {
				if (StringUtils.equalsIgnoreCase(type.getToken(), token)) {
					return type;
				}
			}
			return null;
		}
	}

	/**
	 * @return the button text
	 */
	String getButtonText();

	/**
	 * @return the button type
	 */
	ButtonType getButtonType();

	@Override
	public default List<Class<? extends Element>> getDescendantsExcluded() {
		return Arrays.asList(InteractiveContent.class);
	}

}
