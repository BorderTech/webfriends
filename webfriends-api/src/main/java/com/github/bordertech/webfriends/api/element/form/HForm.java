package com.github.bordertech.webfriends.api.element.form;

import com.github.bordertech.webfriends.api.common.attribute.AttributeToken;
import com.github.bordertech.webfriends.api.common.capability.Autocapitalizable;
import com.github.bordertech.webfriends.api.common.category.FlowContent;
import com.github.bordertech.webfriends.api.common.category.PalpableContent;
import com.github.bordertech.webfriends.api.common.context.FlowContext;
import com.github.bordertech.webfriends.api.common.form.category.FormAssociated;
import com.github.bordertech.webfriends.api.common.model.CustomModel;
import com.github.bordertech.webfriends.api.common.model.FlowModel;
import com.github.bordertech.webfriends.api.common.tags.TagForm;
import com.github.bordertech.webfriends.api.element.Element;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * The form element represents a collection of form-associated elements, some of which can represent editable values that can be submitted to a server
 * for processing.
 *
 * @see <a href="https://developer.mozilla.org/en-US/docs/Web/HTML/Element/form">Web Docs</a>
 * @see <a href="https://html.spec.whatwg.org/#the-form-element">HTML Spec</a>
 */
public interface HForm extends FlowContent, PalpableContent,
		FlowContext,
		FlowModel, CustomModel,
		Autocapitalizable {

	/**
	 * Autocomplete type.
	 */
	enum AutocompleteType implements AttributeToken {
		ON("on"),
		OFF("off");

		/**
		 * Attribute key.
		 */
		public static final String ATTR = "autocomplete";

		private final String token;

		/**
		 * @param token the attribute token
		 */
		private AutocompleteType(final String token) {
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
		public static AutocompleteType findType(final String token) {
			if (token == null) {
				return null;
			}
			for (AutocompleteType type : AutocompleteType.values()) {
				if (StringUtils.equalsIgnoreCase(type.getToken(), token)) {
					return type;
				}
			}
			return null;
		}

	}

	@Override
	TagForm getTagType();

	/**
	 * @return the name of the form
	 */
	String getFormName();

	/**
	 * @return the URL to use for form submission
	 */
	String getActionUrl();

	/**
	 * @return the inherited auto complete state for form controls
	 */
	AutocompleteType getAutocomplete();

	/**
	 * @return POST or GET
	 */
	String getMethod();

	/**
	 * @return true if bypass control validation for form submission
	 */
	boolean isNoValidate();

	/**
	 * @return the form target
	 */
	String getFormTarget();

	/**
	 * @return the form associated controls
	 */
	List<? extends FormAssociated> getAssociated();

	/**
	 * @return the number of associated controls
	 */
	default int getAssociatedCount() {
		return getAssociated().size();
	}

	/**
	 * Submit the form.
	 */
	void formSubmit();

	/**
	 * Resets the form.
	 */
	void formReset();

	@Override
	default List<Class<? extends Element>> getDescendantsExcluded() {
		return Arrays.asList(HForm.class);
	}

}
