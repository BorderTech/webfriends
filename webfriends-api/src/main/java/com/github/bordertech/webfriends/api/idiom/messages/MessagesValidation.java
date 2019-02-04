package com.github.bordertech.webfriends.api.idiom.messages;

import com.github.bordertech.webfriends.api.element.Element;
import java.util.List;

/**
 * Element with validation messages.
 */
public interface MessagesValidation extends Element {

	/**
	 * @return true if has validation messages
	 */
	boolean hasValidationMessages();

	/**
	 * @param message the validation message to check
	 * @return true if has validation message
	 */
	boolean hasValidationMessage(final String message);

	/**
	 * @return the list of validation messages
	 */
	List<String> getValidationMessages();
}
